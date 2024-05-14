function numAleatorio() {
  return Math.round(Math.random() * 2) + 1;
}

function eleccion(jugada) {
  let resultado = "";
  if (jugada == 1) {
    resultado = "Piedra 🪨";
  } else if (jugada == 2) {
    resultado = "Papel 📰";
  } else if (jugada == 3) {
    resultado = "Tijera ✂️";
  } else {
    resultado = "Mal elegido";
  }
  return resultado;
}

//1 = piedra, 2 = papel, 3 = tijera
let jugador = 0;
let pc = 0;
let triunfos = 0;
let perdidas = 0;

while (triunfos < 3 && perdidas < 3) {
  pc = numAleatorio();
  jugador = prompt("Elige: 1 piedra, 2 papel, 3 tijera");

  //alert("Elige jugador: " + jugador);
  alert("PC elige: " + eleccion(pc));
  alert("Tu eliges: " + eleccion(jugador));

  //combate
  if (pc == jugador) {
    alert("Empate");
  } else if (jugador == 1 && pc == 3) {
    alert("Ganaste!!");
    triunfos++;
  } else if (jugador == 2 && pc == 1) {
    alert("Ganaste!!");
    triunfos++;
  } else if (jugador == 3 && pc == 2) {
    alert("Ganaste!!");
    triunfos++;
  } else {
    alert("Perdiste!");
    perdidas++;
  }
}

alert("Ganaste " + triunfos + " veces. Perdiste " + perdidas + " veces");

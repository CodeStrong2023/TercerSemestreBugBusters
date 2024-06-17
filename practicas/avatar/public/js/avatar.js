let ataqueJugador;
let ataqueEnemigo;
let personajeVida = 3;
let enemigoVida = 3;

let ganador = document.getElementById("ganador");
let vidaPersonaje = document.getElementById("personaje-vida");
let vidaEnemigo = document.getElementById("enemigo-vida");
let mensajeGanador = document.getElementById("mensaje-ganador");

function iniciarJuego(){
  let botonPersonajeJugador = document.getElementById("boton-personaje");
  botonPersonajeJugador.addEventListener("click", function(){
      seleccionarPersonajeJugador(), seleccionarEnemigoRandom()});

  let btnPunio = document.getElementById("boton-punio");
  btnPunio.addEventListener("click", ataquePunio);
  let btnPatada = document.getElementById("boton-patada");
  btnPatada.addEventListener("click", ataquePatada);
  let btnBarrida = document.getElementById("boton-barrida");
  btnBarrida.addEventListener("click", ataqueBarrida);    
}

function seleccionarPersonajeJugador() {
    let personajeJugador = document.getElementsByName("personaje");
    let spanPersonajeJugador = document.getElementById("personaje-jugador");
  
    for (let personaje of personajeJugador) {
      if (personaje.checked) {
        if (personaje.id == "zuko") {
          spanPersonajeJugador.innerHTML = "Zuko"
        } else if (personaje.id == "katara") {
          spanPersonajeJugador.innerHTML = "Katara"
        } else if (personaje.id == "aang") {
          spanPersonajeJugador.innerHTML = "Aang"
        } else {
          spanPersonajeJugador.innerHTML = "Toph"
        }
        break;
      }
    }
  }
  
  function seleccionarEnemigoRandom(){
      let enemigoRandom = document.getElementById("personaje-enemigo");
      let numRandom = Math.round(Math.random()*3+1);
      if(numRandom == 1){
          enemigoRandom.innerHTML = "Zuko"
      }else if(numRandom == 2){
          enemigoRandom.innerHTML = "Katara"
      }else if(numRandom == 3){
          enemigoRandom.innerHTML = "Aang"
      }else{
          enemigoRandom.innerHTML = "Toph"
      }
  }
  
  function ataquePunio(){
    ataqueJugador = "Punio";
    ataqueAleatorioEnemigo();
  }

  function ataquePatada(){
    ataqueJugador = "Patada";
    ataqueAleatorioEnemigo();
  }

  function ataqueBarrida(){
    ataqueJugador = "Barrida";
    ataqueAleatorioEnemigo();
  }

  function ataqueAleatorioEnemigo(){
    let ataqueAleatorio = Math.round(Math.random()*2+1);

    if(ataqueAleatorio == 1){
      ataqueEnemigo = "Punio";
    }else if(ataqueAleatorio == 2){
      ataqueEnemigo = "Patada";
    }else{
      ataqueEnemigo = "Barrida";
    }
    ganadorPelea(ataqueJugador, ataqueEnemigo);
  }

  function crearMensaje(){
    let seccionMensaje = document.getElementById("mensajes");
    let parrafo = document.createElement("p");
    parrafo.innerHTML = `Tu personaje atacó con ${ataqueJugador}, el personaje enemigo atacó con ${ataqueEnemigo} - ${ganador}`

    seccionMensaje.appendChild(parrafo);
  }

  function ganadorPelea(ataqueJugador, ataqueEnemigo){
    if((ataqueJugador == "Punio" && ataqueEnemigo == "Barrida") || 
    (ataqueJugador == "Patada" && ataqueEnemigo == "Punio") ||
    (ataqueJugador == "Barrida" && ataqueEnemigo == "Patada")){
      ganador = "GANASTE 🎉";
      crearMensaje();
      vidaEnemigo.innerHTML = --enemigoVida; //restamos la vida del enemigo si nuestro personaje gana
      if(enemigoVida == 0){
        mensajeGanador.innerHTML = "GANASTE!"
      }
    }else if(ataqueJugador == ataqueEnemigo){
      ganador = "EMPATE";
      crearMensaje();
    }else{
      ganador = "PERDISTE 😵";
      crearMensaje();
      vidaPersonaje.innerHTML = --personajeVida; //restamos la vida de nuestro personaje si el enemigo gana
      if(personajeVida == 0){
        mensajeGanador.innerHTML = "PERDISTE!"
      }
    }
  }

window.addEventListener('load', iniciarJuego)

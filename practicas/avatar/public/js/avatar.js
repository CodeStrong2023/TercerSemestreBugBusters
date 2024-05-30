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
  
  let botonPersonajeJugador = document.getElementById("boton-personaje");
  botonPersonajeJugador.addEventListener("click", function(){
      seleccionarPersonajeJugador(), seleccionarEnemigoRandom()});


window.addEventListener('load', iniciarJuego)

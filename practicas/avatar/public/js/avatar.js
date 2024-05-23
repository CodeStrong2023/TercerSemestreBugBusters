function seleccionarPersonajeJugador() {
  let personajeJugador = document.getElementsByName("personaje");

  for (let personaje of personajeJugador) {
    if(personaje.checked){
        if (personaje.id == "zuko"){
            alert("SELECCIONASTE A ZUKO");
        }else if(personaje.id == "katara"){
            alert("SELECCIONASTE A KATARA");
        }else if(personaje.id == "aang"){
            alert("SELECCIONASTE A AANG");
        }else{
            alert("SELECCIONASTE A TOPH");
        }
        break;
    }
  }
}

let botonPersonajeJugador = document.getElementById("boton-personaje");
botonPersonajeJugador.addEventListener("click", seleccionarPersonajeJugador);

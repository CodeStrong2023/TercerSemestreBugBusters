package domain;

public class Persona {
  private final int idPersona;
  private static int contadorPersonas;

  static{ //Bloque inicializacion estatico
    System.out.println("Ejecucion del bloque estatico");
    ++Persona.contadorPersonas;
    /*idPersona=10; No es estatico por eso da un error*/
  }

}

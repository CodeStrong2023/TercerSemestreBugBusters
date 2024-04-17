package domain;

public class Persona {
  private final int idPersona;
  private static int contadorPersonas;

  static{ //Bloque inicializacion estatico
    System.out.println("Ejecucion del bloque estatico");
    ++Persona.contadorPersonas;
    /*idPersona=10; No es estatico por eso da un error*/
  }
  { //Bloque de inicialiacion NO estatico(contexto dinamico)
       System.out.println("Ejecucion del bloque NO estatico");
       this.idPersona = Persona.contadorPersonas++;//Incrementamos elatributo
    
  }
  //Los bloques de inicializacion se ejecutan antes del constructor
  public Persona(){
      System.out.println("Ejecucion del constructor");
  }

  public int getIdPersona () {
      return this.idPersona;
  }
}

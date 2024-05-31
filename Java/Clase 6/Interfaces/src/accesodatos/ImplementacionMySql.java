package accesodatos;

public class ImplementacionMySql implements AccesoDato {

  @override
  public class insertar(){
    System.out.println("Insertar desde MySQL")
  }
  @override
  public void listar(){
    System.out.println("Listar desde MySQL")
  }

  @override
  public void actualizar(){
    System.out.println("Actualizar desde MySQL")
  }
  @override
  public void eliminar(){
    System.out.println("Eliminar desde MySQL")
  }
}
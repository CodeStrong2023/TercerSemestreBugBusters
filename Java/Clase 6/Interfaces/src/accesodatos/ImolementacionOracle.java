package accesodatos;

public class ImolementacionOracle implements IAccesoDatos{
  @override
  public class insertar(){
    System.out.println("Insertar desde Oracle")
  }
  @override
  public void listar(){
    System.out.println("Listar desde Oracle")
  }

  @override
  public void actualizar(){
    System.out.println("Actualizar desde Oracle")
  }
  @override
  public void eliminar(){
    System.out.println("Eliminar desde Oracle")
}
}

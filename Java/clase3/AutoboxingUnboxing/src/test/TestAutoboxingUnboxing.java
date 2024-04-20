package test;

public class TestAutoboxingUnboxing {
  public static void main (String[] args){
    //Clases envolventes
    /*
    clases envolvejntes de tipos primitivos
    int = la clase envolvente es integer
    long = la clase envolvente es Long
    float = la clase envolvente es Float
    double = la clase envolvente es Double
    boolean = la clase envolvente es Boolean
    byte = la clase envolvente es Byte
    char = la clase envolvente es Character
    short = la clase envolvente es short
     */
   int enteroPrim = 10; //Tipo primitivo
    System.out.println("enteroPrim= " + enteroPrim);
   Integer entero = 10;// Tipo object con la clase integer
   System.out.println("entero = " + entero.doubleValue()); //Autoboxing

    int entero2 = entero; //Unboxing
    System.out.println("entero2");
  }
}

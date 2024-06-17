import java.util.Scanner;
public class CaclculadoraUTN {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("*****Apliacion Calculadora******");
    System.out.println("Digite valor para el operando1");
    var operando1 = Integer.parseInt(entrada.nextLine());
    System.out.println("Digite valor para el operando2");
    var operando2 = Integer.parseInt(entrada.nextLine());
    var resultado = operando1 + operando2;
    System.out.println("resultado " + resultado);

  }
}

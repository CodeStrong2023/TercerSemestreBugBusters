import java.util.Scanner;
public class CaclculadoraUTN {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("*****Apliacion Calculadora******");
    //Mostramos el menú
    System.out.println("""
                         1. Suma
                         2. Resta
                         3. Multiplicacion
                         4. Division
                         5. Salir
                         """);
    System.out.print("Operacion a realizar? ");
    int operacion = Integer.parseInt(entrada.nextLine());
    if(operacion >= 1 && operacion <= 4){
        System.out.println("Digite valor para el operando1");
        var operando1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite valor para el operando2");
        var operando2 = Integer.parseInt(entrada.nextLine());
    
        int resultado;
        switch(operacion){
            case 1:
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                System.out.println("Resultado de la division: " + resultado);
                break;
            default:
                System.out.println("Opcion erronea: " + operacion);
        }
    }else if(operacion == 5){
        System.out.println("Hasta pronto!");
    }else{
        System.out.println("Opcion erronea: " + operacion);
    }
  }
}

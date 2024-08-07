import java.util.Scanner;
public class CaclculadoraUTN {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
    while (true){ //Ciclo infinito
      System.out.println("*****Apliacion Calculadora******");
      mostrarMenu();

      try{
        int operacion = Integer.parseInt(entrada.nextLine());
        if(operacion >= 1 && operacion <= 4){
            ejecutarOperacion(operacion, entrada);
        }else if(operacion == 5){
            System.out.println("Hasta pronto!");
            break; //Rompe el ciclo y sale
        }else{
            System.out.println("Opcion erronea: " + operacion);
        }
         //Imprimimos un salto de linea antes de repetir el menu
         System.out.println();
      } catch (Exception e){ //Fin try, comienzo del catch
          System.out.println("Ocurrió un error: " + e.getMessage());
          System.out.println();
      }
    } //Fin while
  } //Fin main

    private static void mostrarMenu(){
        //Mostramos el menú
        System.out.println("""
                           1. Suma
                           2. Resta
                           3. Multiplicacion
                           4. Division
                           5. Salir
                           """);
        System.out.print("Operacion a realizar? ");
    } // Fin metodo mostrarMenu()

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.println("Digite valor para el operando1");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite valor para el operando2");
        var operando2 = Double.parseDouble(entrada.nextLine());
        Double resultado;
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
    }
} //Fin clase

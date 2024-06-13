
package test;

import static aritmetica.Aritmetica.division; //Importamos el método

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0); //Usamos el método importado de aritmetica
        } catch (Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out); // se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        System.out.println("La variable de resultado tiene como valor: "+resultado);
    }
}

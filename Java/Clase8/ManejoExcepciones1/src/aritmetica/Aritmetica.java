package aritmetica;

import excepciones.operacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if(denominador == 0){
            throw new operacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}

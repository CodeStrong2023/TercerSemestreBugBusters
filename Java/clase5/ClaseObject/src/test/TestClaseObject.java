/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;
/**
 *
 * @author Franco
 */
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",5000);
        Empleado empleado2 = new Empleado("juan",5000);

    if(empleado1 == empleado2){
        System.out.println("Tienen la misma referencia en memoria");
    } else {
        System.out.println("Tienen distinta referencia en memoria");
    }

    if(empleado1.equals(empleado2)){
        System.out.println("Los objetos son inguales en contenido");
    } else{
        System.out.println("Los objetos son distintos en contenido");
    }
    if(empleado1.hasCode() == empleado2.hasCode()){
        System.out.println("El valor hasCode es igual");
    } else{
        System.out.println("El valor hasCode es diferente");
    }
    }
}

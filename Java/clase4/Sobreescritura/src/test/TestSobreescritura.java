/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author Franco
 */
public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Nicolas", 4500.55);
        imprimir(empleado1);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());

        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        imprimir(empleado1);
        //System.out.println("gerernte1 = " + gerernte1.obtenerDetalles());

    }

    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
}

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
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a métodos Escritor
        
        //Downcasting getter
        //((Escritor)empleado).getTipoEscritura(); //Tenemos 2 opciones: esta es una
        Escritor escritor = (Escritor)empleado; //esta es la segunda opcion
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}

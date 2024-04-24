/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.Clase4;

/**
 *
 * @author Franco
 */
public class TestDefault {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefault = "cambio desde la prueba";
        System.out.println("claseH2 atributo default = " + claseH2.atributoDefault);
        
        
        Clase4 clase4 = new Clase4("Publico");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio");
        System.out.println("clase4 = " + clase4.getAtributoPrivate());
    }
}
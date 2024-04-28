/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Gerente;

/**
 *
 * @author Franco
 */
public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerernte1 = new Gerente("Jose", 5000, "Sistemas");
        System.out.println("gerernte1 = " + gerernte1.obtenerDetalles());
    }
}

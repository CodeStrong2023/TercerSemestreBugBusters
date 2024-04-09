/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

import ar.com.system2023.mundopc.*;

/**
 *
 * @author Franco
 */
public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("HP", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        Orden orden2 = new Orden(); //Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostarOrden();
        
        Computadora computadoraVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadoraVarias);
        
        orden1.mostarOrden();
        orden2.mostarOrden();
    }
}
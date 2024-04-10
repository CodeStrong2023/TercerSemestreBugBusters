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

        // Agregar más computadoras a la orden1 hasta tener 10 elementos
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Raton ratonDell = new Raton("USB", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        orden1.agregarComputadora(computadoraDell);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        Teclado tecladoLenovo = new Teclado("Inalámbrico", "Lenovo");
        Raton ratonLenovo = new Raton("Inalámbrico", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        orden1.agregarComputadora(computadoraLenovo);
        
        //Crear más objetos de tipo computadora con todos sus elementos
        //Completar una lista en el objeto orden1 que llegue a los 10 elementos

        Monitor monitorSony = new Monitor("Sony", 24);
        Teclado tecladoSony = new Teclado("Bluetooth", "Sony");
        Raton ratonSony = new Raton("Bluetooth", "Sony");
        Computadora computadoraSony = new Computadora("Computadora Sony", monitorSony, tecladoSony, ratonSony);
        orden1.agregarComputadora(computadoraSony);
        
        Monitor monitorAcer = new Monitor("Acer", 20);
        Teclado tecladoAcer = new Teclado("USB", "Acer");
        Raton ratonAcer = new Raton("USB", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        orden1.agregarComputadora(computadoraAcer);
        
        Monitor monitorAsus = new Monitor("Asus", 25);
        Teclado tecladoAsus = new Teclado("Inalámbrico", "Asus");
        Raton ratonAsus = new Raton("Inalámbrico", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        orden1.agregarComputadora(computadoraAsus);
        
        Monitor monitorSamsung = new Monitor("Samsung", 28);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        orden1.agregarComputadora(computadoraSamsung);
        
        Monitor monitorApple = new Monitor("Apple", 22);
        Teclado tecladoApple = new Teclado("USB", "Apple");
        Raton ratonApple = new Raton("USB", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        orden1.agregarComputadora(computadoraApple);
        
        Monitor monitorMicrosoft = new Monitor("Microsoft", 30);
        Teclado tecladoMicrosoft = new Teclado("Inalámbrico", "Microsoft");
        Raton ratonMicrosoft = new Raton("Inalámbrico", "Microsoft");
        Computadora computadoraMicrosoft = new Computadora("Computadora Microsoft", monitorMicrosoft, tecladoMicrosoft, ratonMicrosoft);
        orden1.agregarComputadora(computadoraMicrosoft);
        
        Monitor monitorLG = new Monitor("LG", 29);
        Teclado tecladoLG = new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        orden1.agregarComputadora(computadoraLG);
        
        orden1.mostrarOrden();
    }
}


        
        Computadora computadoraVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadoraVarias);
        
        orden1.mostarOrden();
        orden2.mostarOrden();
    }
}
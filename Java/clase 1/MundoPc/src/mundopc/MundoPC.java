
package mundopc;

import ar.com.system2023.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        //Objeto 1
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Objeto 2
        Monitor monitorGamer = new Monitor("HP", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorSamsung = new Monitor("Samsung", 27);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        
        Monitor monitorApple = new Monitor("Apple", 22);
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        
        Monitor monitorAcer = new Monitor("Acer", 24);
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        
        Monitor monitorDell = new Monitor("Dell", 32);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        
        
        //Más objetos de tipo Computadora
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        Computadora computadoraVarias1 = new Computadora("Computadora diferentes marcas", monitorLenovo, tecladoSamsung, ratonHP);
        Computadora computadoraVarias2 = new Computadora("Computadora diferentes marcas", monitorApple, tecladoDell, ratonSamsung);
        Computadora computadoraVarias3 = new Computadora("Computadora diferentes marcas", monitorAcer, tecladoLenovo, ratonApple);
        Computadora computadoraVarias4 = new Computadora("Computadora diferentes marcas", monitorSamsung, tecladoSamsung, ratonDell);
        
        
        //Orden 1
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraVarias1);
        orden1.agregarComputadora(computadoraVarias2);
        orden1.agregarComputadora(computadoraVarias3);
        
        orden1.agregarComputadora(computadoraVarias4); //Entra al else del condicional por haber superado el limite máximo de 10 computadoras.
        
        
        orden1.mostrarOrden();
        
        Computadora computadoraVarias = new Computadora("Computadora diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        
        //Orden 2
        Orden orden2 = new Orden(); //Una nueva lista para el objeto orden2
        orden2.agregarComputadora(computadoraVarias);
        orden2.mostrarOrden();
        
        //Tarea
        //Crear mas objetos de tipo computadora
        //Completar la lista de la orden 1 con 10 o más elementos        
    }
}

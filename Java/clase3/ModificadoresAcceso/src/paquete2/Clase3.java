package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3(){
        super("protected");
        this.atributoProtected= "Accedemos desde la clasee hija";
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.atributoPublic= "es totallmente publico";
    }
}

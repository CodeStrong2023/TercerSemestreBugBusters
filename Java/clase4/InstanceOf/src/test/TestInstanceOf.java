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
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Nicolas", 4500.55);
        //determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        determinarTipo(empleado1);

    }

    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            //Gerente  gerente = (Gerente)empleado;
            ((Gerente) empleado).getDepartameto();
            System.out.println("gerente = " + empleado);
        }
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
            //Gerente  gerente = (Gerente)empleado;
            //System.out.println("gerente = "+ gerente.getDepartamento());
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            
        }
    }
}
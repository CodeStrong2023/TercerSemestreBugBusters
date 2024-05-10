/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Franco
 */
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //metodo para la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+ this.nombre+", Sueldo: "+this.sueldo;
    }
}

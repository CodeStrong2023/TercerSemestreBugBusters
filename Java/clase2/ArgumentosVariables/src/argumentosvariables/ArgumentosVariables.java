
package argumentosvariables;


public class ArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        
        variosParametros("Juan","Perez",7,8,9);
        
    }
    
    public static void imprimirNumeros(int... numeros){ //estos argumentos se convierten en un arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
    
    public static void variosParametros(String nombre, String apellido, int... numeros){ //los argumentos variables siempre al final
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        imprimirNumeros(numeros);
    }
}

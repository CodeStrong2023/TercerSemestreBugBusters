import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menú
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("ocurrió un error: "+e.getMessage());
            }
            System.out.println();
        }//Fin ciclo while
    }//Fin metodo main

    private static void mostrarMenu(){
        //Mostramos opciones
        System.out.print("""
                ******** Listado de Personas ********
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.println("Digite una de las opciones: ");
    }//Fin metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //Revisamos la opcion digitada a través de un swtich
        switch (opcion){
            case 1 -> {//Agregar una persona a la lista
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el teléfono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                //Creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene "+personas.size()+" elementos");
            }//Fin caso 1
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas: ");
                //Mejoras con lambda y el metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);//Metodo de referencia
            }//Fin caso 2
            case 3 -> {//Salir del ciclo
                System.out.println("Hasta pronto....");
                salir = true;
            }//Fin caso 3
            default -> System.out.println("Opcion incorrecta: "+opcion);
        }//Fin del switch
        return salir;
    }//Fin metodo ejecutarOperacion
}//Fin clase ListadoPersonasApp
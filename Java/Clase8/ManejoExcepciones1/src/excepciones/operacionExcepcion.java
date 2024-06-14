package excepciones;
public class operacionExcepcion extends RuntimeException{
    //Constructor
    public operacionExcepcion(String mensaje){
        super(mensaje);
    }
}

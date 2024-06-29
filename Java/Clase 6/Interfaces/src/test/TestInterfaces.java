
package test;

import accesodatos.*;
public class TestInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.listar();
    }
}

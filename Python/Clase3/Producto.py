class Producto:
    contador_productos = 0 # Variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1 # Aumento para la variable de clase
        self._id_producto = Producto.contador_productos # Asignacion desde la variable de clase
        self._nombre = nombre
        self._precio = precio
    # Metodos setters and getters
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(selfself):
        return self._precio

    @precio.setter
    def precio(self):
        self._precio = precio
    # Sobre escribimos el metodo str
    def __str__(self):
        return f'Id Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'

if __name__ == '__main__': # Solo será visible si la prueba se ejecuta desde aqui
    producto1 = Producto('Camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)

class ManejoArchivos:
    def __int__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print('Obtenemos el recurso'.center(50, '-'))
        self.nombre = open(self.nombre, 'r', ecoding='utf8') # Encapsulamos el código dentro del método
        return self.nombre

    def __exit__(self, tipo_exception, valor_exception, traza_error):
        print('cerramos el recurso'.center(50, '-'))
        if self.nombre:
            self.nombre.close() # Cerramos el archivo

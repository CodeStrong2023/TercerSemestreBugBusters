class Empleado: #No hereda sino solo de la clase objet
    def __init__(self, nombre,sueldo):
        self.nombre = nombre
        self.sueldo = sueldo
        
    def __str__(self):
        return f'Empleado: [Nombre: {self.nombre}, Sueldo: {self.sueldo}]'
        
    def mostrar_detalles(self):
        return self.__str__()
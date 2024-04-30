from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
    # print(objeto) # de manera indirecta llama al str de la clase Empleado o Gerente
    print(type(objeto)) # Esto es para saber el tiop de dato que recibe
    print(objeto.mostrar_detalles())

empleado = Empleado('Ariel', 50000.00)
imprimir_detalles(empleado)

gerente = Gerente('Natalia', 60000.00, 'Sistemas')
imprimir_detalles(gerente)
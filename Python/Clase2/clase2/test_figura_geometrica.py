from Cuadrado import Cuadrado
from clase2.Rectangulo import Rectangulo

print("Creación de objeto clase Cuadrado".center(50,"-"))
cuadrado1= Cuadrado(8, 'Azul')
cuadrado1.alto = 7
cuadrado1.ancho = 7
# print(cuadrado1.ancho)
# print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado : {cuadrado1.Calcular_area()}')

#MRO = Method Resolution Order
# print(Cuadrado.mro())

print(cuadrado1)

print("Creación de objeto clase Rectangulo".center(50,"-"))
rectangulo1 = Rectangulo(3, 9, 'verde')
rectangulo1.ancho = 8
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)
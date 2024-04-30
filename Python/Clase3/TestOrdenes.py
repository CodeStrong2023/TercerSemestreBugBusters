from Orden import Orden
from Producto import Producto

producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalon', 150.00)
productos1 = [producto1, producto2]
orden1 = Orden(productos1)
print(orden1)
print(f"Total de la orden1: {orden1.calcular_total()}")

producto3 = Producto("Remera", 75.00)
producto4 = Producto("Buzo", 175.00)
producto5 = Producto("Medias", 20.00)
producto6 = Producto("Gorra", 43.00)

producto7 = Producto("Campera", 250.00)
producto8 = Producto("Sweter", 95.00)
producto9 = Producto("Camisa", 85.00)
producto10 = Producto("Zapatillas", 210.00)

productos2 = [producto3, producto4, producto5, producto6]

orden2 = Orden(productos2)

# Agregamos productos con el metodo agregar_producto
orden2.agregar_producto(producto7)
orden2.agregar_producto(producto8)
orden2.agregar_producto(producto9)
orden2.agregar_producto(producto10)

print(orden2)
print(f"Total de la orden2: {orden2.calcular_total()}")
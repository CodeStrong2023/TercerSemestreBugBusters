
archivo = open("prueba.txt", "r", encoding="utf8") # r es de read(leer)
# print(archivo.read())
print(archivo.read(16))
print(archivo.read(10)) #Continuamos desde la línea anterior
print(archivo.readline())
print(archivo.readline())
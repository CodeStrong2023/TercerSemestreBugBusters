
archivo = open("prueba.txt", "r", encoding="utf8") # r es de read(leer)
# print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10)) #Continuamos desde la línea anterior
#print(archivo.readline())
#print(archivo.readline())

#vamos a iterar el archivo,cada una de las lineas
#for linea in archivo:
   # print(linea): iteramos todo los elementos del archivo
print(archivo.readline()[11]): #accedemos al archivo como si fuera una lista
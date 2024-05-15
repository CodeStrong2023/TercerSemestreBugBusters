# Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding="utf8") #La w es de write = escribir
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt \n')
    archivo.write("Los acentos son importantes para las palabras\n")
    archivo.write("como por ejemplo: acción, ejecución y producción\n")
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
    
# archivo.write("Todo quedó perfecto"): este es un error

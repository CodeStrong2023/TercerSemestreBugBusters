opcion = None
while opcion != 4:
    try:
        print('opciones')
        print('1. agregar peliculas')
        print('2. listar peliculas')
        print('3. eliminar catalogo de peliculas')
        print('4.salir')
        opcion = int(input('digite una opcion del 1-4))'))
    except Exception as e:
        print(f'ocuttio un error del tipo:{e}')
        opciones = None
    else:
        print('salimos del programa')



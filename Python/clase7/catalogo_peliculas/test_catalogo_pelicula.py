from dominio.Pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas as cp

opcion = None
while opcion != 4:
    try:
        print('Opciones')
        print('1. Agregar peliculas')
        print('2. Listar peliculas')
        print('3. Eliminar catalogo de peliculas')
        print('4. Salir')
        opcion = int(input('Digite una opcion del menú (1-4): '))
        if opcion == 1:
            nombre_pelicula = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()
    except Exception as e:
        print(f'ocurrio un error del tipo:{e}')
        opciones = None
    else:
        print('salimos del programa')
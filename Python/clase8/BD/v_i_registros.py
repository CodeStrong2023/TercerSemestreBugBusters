import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user='postgres',
    password='1234',
    host='localhost',
    port='5432',
    database='test_db'
)

try:
    with conexion:
        with conexion.cursor() as cursor:
            query = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
            valores = (("Carlos", "Lara", "clara@gmail.com"),
                       ("Marcos", "Canto", "mcant@gmail.com"),
                       ("marcelo", "Cuenca", "cuencaM@gmail.com")
                       ) # Tupla de tuplas
            cursor.executemany(query, valores) # De esta manera ejecutamos la query
            # conexion.commit()
            registros_insertados = cursor.rowcount
            print(f"Los registros insertados son: {registros_insertados}")
except Exception as e:
    print(f"Ocurrió un error: {e}")
finally:
    conexion.close()
import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='localhost',
    port='5432',
    database='test_db'
)

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'
            entrada = input('Digite los números de registro a eliminar (separados por coma): ')
            valores = (tuple(entrada.split(', ')),) # Tupla de tuplas
            cursor.execute(sentencia, valores) # De esta manera ejecutamos la query
            registros_eliminados = cursor.rowcount
            print(f"Los registros actualizados son: {registros_eliminados}")
except Exception as e:
    print(f"Ocurrió un error: {e}")
finally:
    conexion.close()
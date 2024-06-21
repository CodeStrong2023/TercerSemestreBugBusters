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
            query = 'UPDATE persona SET nombre = %s, apellido = %s, email = %s WHERE id_persona = %s'
            valores = ('Juan Carlos', 'Roldan', 'rcarlos@mail.com', 1) # Tupla de tuplas
            cursor.executemany(query, valores) # De esta manera ejecutamos la query
            registros_actualizados = cursor.rowcount
            print(f"Los registros actualizados son: {registros_actualizados}")
except Exception as e:
    print(f"Ocurrió un error: {e}")
finally:
    conexion.close()
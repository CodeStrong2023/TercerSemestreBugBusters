import psycopg2 as bd # Esto es para poder conectarnos a lo que es Postgres

conexion = bd.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
        # conexion.autocommit = False # esto directamente no deberia estar
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() #Hacemos el commit manualm,ente
    print('Termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'Ocurrió un error, se hizo un rollback: {e}')
finally:
    conexion.close()


# https://www.psycopg.org/docs/usage.html


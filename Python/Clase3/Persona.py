class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self,other):
        return f'{self.nombre} {other.nombre}'

    def __sub__(self,otro): #Sub significa = subtraction (resta)
        return self.edad - otro.edad

persona1 = Persona('Marcos',28)
persona2 = Persona ('Senn',10)

# persona1.__add__(persona2) sintaxis interna y automatica
print(persona1 + persona2)
print(persona1 - persona2)

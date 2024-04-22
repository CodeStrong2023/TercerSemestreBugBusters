class Persona:
    contador_personas = 0
    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1
        return cls.contador_personas

    def __init__(self,nombre,edad):
        self.id_persona=Persona.generar_siguiente_valor()
        self.edad = edad

        def __str__(self):
            return f'Persona [{self.id_persona}{self.nombre}{self.edad}]'

persona1 = Persona('Marcos',100)
print(persona1)
print(f'valor contador personas:{Persona.contador_personas}')
Persona.generar_siguiente_valor()
persona2 = Persona("Marisol",200)
print(persona2)
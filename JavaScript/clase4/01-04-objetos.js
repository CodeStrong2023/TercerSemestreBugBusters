let x = 10; //variable de tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: "Davis",
    apellido: "Davington",
    email: "ddavington@gmail.com",
    edad: 28,
    nombreCompleto: function(){//metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona)
console.log(persona.nombreCompleto());
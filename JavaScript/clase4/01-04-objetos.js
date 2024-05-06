let x = 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos Primitivos');

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
console.log('Ejecutando con un objeto');

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14'
persona2.telefono = '2604010203'
console.log(persona2.telefono);

console.log('Creamos un nuevo objeto');
console.log(persona['apellido']);//accedemos como si fuera un arreglo

//for in
for(let i in persona){
    console.log(persona[i])
}

persona.apellido = "Lopez"; //Cambiamos dinamicamente un valor del objeto
console.log(persona)
//Agregar una nueva propiedad al objeto
persona.direccion = "Av. Python";
console.log(persona)

//Eliminar una propiedad del objeto
delete persona.direccion;
console.log(persona)

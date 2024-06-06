let x = 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos Primitivos');

//Objeto
let persona = {
    nombre: "Davis",
    apellido: "Davington",
    email: "ddavington@gmail.com",
    edad: 28,
    idioma: 'es',
    get lang(){ //Este es el metodo get
        return this.idioma.toUpperCase(); //Convierte las minusculas a mayusculas
    },
    set lang(Lang){
        this.idioma = lang.toUpperCase()
    },
    nombreCompleto: function(){//metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){ //Este es el metodo get
        return 'El nombre es: ' + this.nombre + ', Edad: ' + this.edad;
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

//Distintas formas de imprimir un objeto
//Numero 1: La mas sencilla: concatenar cada vakir de cada propiedad
console.log('Distinta forma de limpiar un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido);

//Numero 2: A traves del ciclo for in
console.log('Distinta forma de imprimir un objeto: forma 2');

for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: La funcion Object.values()
console.log('Distinta forma de imprimir un objeto: forma 3');

let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizamos el metodo JSON.stringify
console.log('Distinta forma de imprimir un objeto: forma 4');

let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el metodo GET');
console.log(persona.nombreEdad);

console.log('Comenzamos con el metodo GET para idiomas');
persona.lang = 'en';
console.log(persona.lang);

//clase 4

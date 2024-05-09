let x = 10; //Variable de tipo primitiva
console.log(x.lemgth);
console.log('Tipos primitivos');

//Objeto

let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'es',
    nombreCompleto: function(){ // metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){
        return 'El nombre es: '+this.nombre+', Edad: '+this.edad;
    },
    get lang(){
        return this.idioma.toUpperCase(); //Convierte las minusculas a mayusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salida 14';
persona2.telefono = '2604567890';
console.log(persona2.telefono);

console.log('Creamos un nuevo objeto');

console.log(persona['apellido']); //Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');

//for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('cambiamos y eliminamos un error')
persona.apellido = 'Betancud' //Cambiamos dinamicamente un valor del objeto
delete persona.apellido; //Eliminamos el error
console.log(persona);

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

console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //constructor 
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis'; //mopdificamos el nombre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la funcion

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.nombreCompleto());






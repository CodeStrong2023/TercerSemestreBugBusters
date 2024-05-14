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
padre.telefono = '54 9 2604 908765'; //una propiedad exlusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la funcion

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto());

//Diferentes forams de crear objetos

//caso objeto 1
let miOBjeto = new Object(); 
//caso objeto 2 
let miOBjeto2 = {}; //Esta opcion es breve y recomendada

//caso String 1
let miCadena1 = new String ('Hola'); //Sintaxis formal
//caso String 2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero = new Number(1);
//caso numeros 2
let miNumero2 = 1; //Sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(false);
//caso boolean 2
let miBoolean2 = false; //Sintaxis recomendada

//caso arreglos 1
let miArreglo = new Array(); //Forma1 
//caso arreglos 2
let miArreglo2 = []; //Sintaxis recomendada

//caso function 1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//caso function 2
let miFuncion2 = function(){}; //Notacion simplificada y recomendada

//Uso de prototype 
Persona3.prototype.telefono = '2604567890';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5462604567890'
console.log(madre.telefono);

//Uso de cacll 

let persona4 ={
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+''+this.apellido+''+telefono;
        //return this.nombre+''+this.apellido;
    }

}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara', 

}

console.log(persona4.nombreCompleto2('Licenciado', '2604569087'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ingeniero', '5492604239876'));

//Metodo Apply
let arreglo = ['Ingeniero', '5492604239876'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
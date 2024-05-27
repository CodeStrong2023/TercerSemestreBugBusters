//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: Persona is not defined


class Persona { // Clase padre
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
}

class Empleado extends Persona{ // Clase hija  
    constructor (nombre,apellido,departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}

let persona1 = new Persona("Martin", "Perez");
//console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);
persona1.apellido = "Sanchez";
console.log(persona1._apellido);

let persona2 = new Persona("Carlos", "Lara");
persona2.nombre = "Maria Laura";
//console.log(persona2);
console.log(persona2.nombre);
persona2.apellido = "Baldovin";
console.log(persona2.apellido);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

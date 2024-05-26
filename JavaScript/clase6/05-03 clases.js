//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: Persona is not defined


class Persona {
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

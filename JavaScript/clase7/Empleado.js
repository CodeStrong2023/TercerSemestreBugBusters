class Empleado extends Persona{

    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    get _idEmpleado(){
        return this._idEmpleado;
    }

    get _sueldo(){
        return this._sueldo;
    }

    set _sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return `
        ${super.toString()} 
        ${this._idEmpleado} 
        ${this._sueldo}`;
    }
}

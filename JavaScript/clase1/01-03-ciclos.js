//while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while");

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while");

//for
for( let contando = 0; contando < 3; contando++){
    console.log(contando); 0, 1, 2
}
console.log("Fin del ciclo for")

//Break
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break;
         //Muestra todos los pares
    }
}
console.log("Termina el ciclo al encontra el primer número par");
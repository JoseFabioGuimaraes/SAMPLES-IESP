function somar(a,b) {
    
    var valor = a+b; // RETURN NÃO É OBRIGATORIO
    return valor;
    
}

var multiplicar = function(numero1, numero2){
    return (numero1*numero2); 
}

console.log(multiplicar(2,4));

function somar2(){
    var total = 0;
    for(var i=0; i < arguments.length; i++){
        if(arguments[i]> 2){

            total += arguments[i];

        }
    
    }
    return total;
}

console.log(somar2(2,4,5,5));



var num1 = prompt("digite seu primeiro valor: ");
var num2 = prompt("digite seu segundo valor: ");

var numeroSom = somar(Number(num1),Number(num2));

console.log(numeroSom);

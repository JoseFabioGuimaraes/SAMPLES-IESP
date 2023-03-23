function somar(a,b) {
    
    var valor = a+b; // RETURN NÃO É OBRIGATORIO
    return valor;
    
}

var num1 = prompt("digite seu primeiro valor: ");
var num2 = prompt("digite seu segundo valor: ");

var numeroSom = somar(Number(num1),Number(num2));

console.log(numeroSom);
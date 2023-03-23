function somar(a,b) {
    
    var valor = a+b; // RETURN NÃO É OBRIGATORIO
    return valor;
    
}
// Pegando as variaveis da soma por meio do comando prompt
var num1 = prompt("digite seu primeiro valor: ");
var num2 = prompt("digite seu segundo valor: ");  

//transformando as variaveis em valores da função
var numeroSom = somar(Number(num1),Number(num2)); // Number serve para transformar o string em numero

//print da variavel numeroSom
console.log(numeroSom);

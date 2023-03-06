/* O código interpreta apenas se o valor inputado na altura for usada com "." não com ","
e se o input do sexo for apenas "M" E "F" em maiúsculo
*/

var k = 0;
var maiorAltura = 0;
var menorAltura = 3.00;
var numeroMulheres = 0;
var numeroHomens = 0;
let mediaMasculinaAltura = 0;
while(k <15){
    k++
    let altura = parseFloat(prompt("Digite sua Altura: ")); 
    var sexo = prompt("Digite seu sexo: ");

    
    if(altura>maiorAltura){ 
        maiorAltura = altura
    }
    if(altura<menorAltura){
        menorAltura = altura
    }
    if(sexo=="F"){
        numeroMulheres+=1
    }
    if(sexo =="M"){
        numeroHomens += 1
        mediaMasculinaAltura += altura
    }


}
let media = mediaMasculinaAltura/numeroHomens;
console.log("Quantidade de mulheres igual a: "+numeroMulheres);
console.log("A maior altura é: "+maiorAltura);
console.log("Já a menor é: "+menorAltura);
console.log("E a media de altura dos homens é igual a: "+media);

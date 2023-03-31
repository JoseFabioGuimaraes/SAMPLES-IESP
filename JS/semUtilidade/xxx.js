function parOuImpar(numero) {
    if (numero < 0) {
      console.log("É obrigatório informar um número maior ou igual a zero");
    } else if (numero % 2 === 0) {
      console.log(numero + " é par");
    } else {
      console.log(numero + " é ímpar");
    }
  }

//TESTE 
parOuImpar(0);
parOuImpar(3);


function multiplicarPorDois() {
    if (arguments.length == 0) {
      console.log("É obrigatório informar pelo menos um valor");
    } else {
      for (var i = 0; i < arguments.length; i++) {
        console.log(arguments[i] * 2);
      }
    }
}

//TESTE
multiplicarPorDois();
multiplicarPorDois(2,4,6);


function ArrayTe(array) {
    
    if (array.length === 0) {
      console.log("Informe um array válido com valores numéricos.");
      return;
    }
  
    
    console.log("Valores do array:");
    array.forEach((value) => 
        console.log(value));
  
   
    var novoArray = array.map((value) => 
        value * 2);
  
    console.log("Os novos valores são:");
    novoArray.forEach((value) => 
        console.log(value));
  
    return novoArray;
  }
//TESTE
ArrayTe([]);
ArrayTe([2,3])

//1) criação do objeto:

var pessoa = {
  nome: "José Fábio",
  idade: 20,
  profissao: "Estagiário",
  endereco: {
    logradouro: "São José",
    bairro: "Centro",
    cidade: "Mamanguape",
    cep: 58280000
  }
};

// 2) função para imprimir os valores

function imprimirObjeto(pessoa){
 for (prop in pessoa){
  console.log(pessoa[prop]);
 }
}

imprimirObjeto(pessoa);

//  3) Adicionando o Telefone

pessoa.telefone = "1234-5678";

// 4) Função obterDados()

var obterDados = function(){
   console.log("Nome: " + pessoa.nome + "; Endereço:  Rua: " + pessoa.endereco.logradouro + ", " + pessoa.endereco.bairro +", " +pessoa.endereco.cidade +", "+pessoa.endereco.cep);
}
obterDados();

// 5) função para comparar

function comparaObjetos(pessoa1, pessoa2) {
  if (pessoa1.nome === pessoa2.nome &&
      pessoa1.endereco.logradouro === pessoa2.endereco.logradouro &&
      pessoa1.endereco.bairro === pessoa2.endereco.bairro &&
      pessoa1.endereco.cidade === pessoa2.endereco.cidade &&
      pessoa1.endereco.cep === pessoa2.endereco.cep) {
    return true;
  } else {
    return false;
  }
}

// 6) novo objeto
var pessoa2 = {
  nome : "José Fábio", 
  endereco: {
    logradouro: "São José",
    bairro: "Centro",
    cidade: "Mamanguape",
    cep: 58280000
  }

}

// 7) print do resultado dos dois objetos

var resultado = comparaObjetos(pessoa,pessoa2);
console.log(resultado)
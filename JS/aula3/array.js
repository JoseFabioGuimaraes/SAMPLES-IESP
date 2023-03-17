var alunos= []; 
console.log(alunos.length); // saber o tamanho do array (obviamente)
var primeiroA = alunos[0];
var i = 0
while (i<5){
    i++;
    var novoValor = prompt("Digite seu nome: "); //adicionando valores com a função push
    alunos.push(novoValor); 
}
alunos.pop //remove o ultimo elemento 
console.log(alunos)

//.toString trasnforma todos os valores da lista em string com o separador de virgula(',')
//.join transforma os valores em string por um separador especifico 
// delete arrayNome[x] remove um valor espefico da tabela
// .forEach(fuction(array)){} percorre o array (tipo um for e print)
// .map (mesma estrutura) TODO: ver como funciona
//.filter
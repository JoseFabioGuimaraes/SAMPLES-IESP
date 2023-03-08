//Questão 02 - Crie uma nova Classe chamado Conta Corrente: Crie os métodos de sacar e depositar valores;
// O método sacar precisará verificar o saldo;

public class ContaCorrente {
    private double saldo;
    public ContaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }
    public double getSaldo(){
        return saldo;
    }
    public void  depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(saldo>= valor){
            saldo -=valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
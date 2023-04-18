package entidades;
import java.util.Random;

public class ContaCorrente {
    private double Saldo;
    private int numero;
    private String titular;
    private String token;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.token = gerarToken();
    }

    public String gerarToken() {
        Random random = new Random();
        String token = Integer.toString(random.nextInt(1000000));
        return token;
    }

    public void atualizarConta(int numero, String titular, String token) {
        if (this.token.equals(token)) {
            this.numero = numero;
            this.titular = titular;
            System.out.println("Conta atualizada com sucesso!");
        } else {
            System.out.println("Token inválido. Acesso negado!");
        }
    }

    // getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}

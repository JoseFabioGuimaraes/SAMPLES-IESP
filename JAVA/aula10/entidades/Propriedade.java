package entidades;

import java.util.ArrayList;

public abstract class Propriedade {
    String endereco;
    int numeroCasa; // string porque pode ser um valor quebrado e na formatação ficaria estranho
    double preco;
    String descricao;

    private ArrayList<reserva> reservas;




    public Propriedade(String Endereco, int numeroCasa, double preco,String descricao){

        this.endereco = Endereco;
        this.numeroCasa = numeroCasa;
        this.preco = preco;
        this.descricao = descricao;
        this.reservas = new ArrayList<>();

    }

    //Get e set


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        descricao = descricao;
    }

    public ArrayList<reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<reserva> reservas) {
        this.reservas = reservas;
    }
}

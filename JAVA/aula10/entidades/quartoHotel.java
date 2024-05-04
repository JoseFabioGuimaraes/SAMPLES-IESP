package entidades;

public class quartoHotel extends Propriedade{

    String temBanheiro;
    int QuantidadeCamas;
    String tipoCama;
    public quartoHotel(String Endereco, int numeroCasa,double preco,String descricao, String temBanheiro,int quantidadeCamas,String tipoCama) {
        super(Endereco, numeroCasa, preco, descricao);
        this.temBanheiro = temBanheiro;
        this.QuantidadeCamas = quantidadeCamas;
        this.tipoCama= tipoCama;

    }
}

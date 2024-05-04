package entidades;

public class casa extends Propriedade{
    int quantQuartos;
    boolean temQuintal;
    public casa(String Endereco, int numeroCasa, double preco, String descricao,  int quantQuartos,boolean temQuintal) {
        super(Endereco, numeroCasa, preco, descricao);
        this.quantQuartos = quantQuartos;
        this.temQuintal = temQuintal;
    }

    //get e set

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public void setQuantQuartos(int quantQuartos) {
        this.quantQuartos = quantQuartos;
    }

    public boolean isTemQuintal() {
        return temQuintal;
    }

    public void setTemQuintal(boolean temQuintal) {
        this.temQuintal = temQuintal;
    }
}

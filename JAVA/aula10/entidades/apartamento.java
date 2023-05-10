package entidades;

public class  apartamento extends Propriedade {

    int quantQuartos;
    int numeroAndar;


    public apartamento(String Endereco, int numeroCasa, int numeroQuartos, double preco, String descricao, int quantQuartos, int numeroAndar) {
        super(Endereco, numeroCasa, preco, descricao);
        this.numeroAndar = numeroAndar;
        this.quantQuartos = quantQuartos;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;

    }

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public void setQuantQuartos(int quantQuartos) {
        this.quantQuartos = quantQuartos;
    }
}


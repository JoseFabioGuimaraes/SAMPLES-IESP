package entidades;

//pesquisar o que é o abstract e final
//
public abstract class Forma {
    //declaração do atributo
    private colors cor;

    //metodo construtor
    public Forma(colors cor){
        this.cor = cor;
    }

    //calcular area (metodo)
    public abstract double calcularArea();

}

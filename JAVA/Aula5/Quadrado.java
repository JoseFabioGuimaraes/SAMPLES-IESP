package entidades;

//Criação da classe Quadrado
public class Quadrado  extends Forma{

        private  double largura, altura;
    public Quadrado(colors cor,double largura, double altura) {
        super(cor); // super serve de referencia ao metodo construtor
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double Area = this.largura *this.largura;
        return Area; // return this.largura *this.largura; (posso usar desse jeito tambem)

    }

}

package entidades;

public class Triangulo extends Forma{

    double altura,base;
    public Triangulo(colors cor,double altura, double base) {
        super(cor);
        this.altura = altura;
        this.base = base;
    }
    @Override //anotação
    public double calcularArea(){
        return (this.altura*this.base)/2;
    }
}

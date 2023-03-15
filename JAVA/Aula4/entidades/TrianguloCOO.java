package entidades;

public class TrianguloCOO {

    private double a,b ,c;

    public TrianguloCOO(double a, double b,double c){ // metodo construtor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calcularP(){
      double p = (this.a+ this.b+ this.c)/2;
      return p;
    }
    public double calcularArea(){
        double pCalculado = calcularP();
        double area = Math.sqrt(pCalculado*(pCalculado-this.a) * (pCalculado - this.b)*(pCalculado-this.c));
        return area;
    }
}

package areatriangulo_oo;

import entidades.TrianguloOO;

public class AreaTrianguloOO {
    public static void main(String[] args) {
        TrianguloOO t1 = new TrianguloOO();
        TrianguloOO t2 = new TrianguloOO();

        t1.a = 3.0;
        t1.b = 4.0;
        t1.c = 5.0;

        t2.a = 7.5;
        t2.b = 4.5;
        t2.c = 4.02;

        double pT1 =(t1.a+ t1.b+t1.c)/2; // p vem da formula de area
        double pT2 =(t2.a+t2.b+t2.c)/2;

        double areaX= Math.sqrt(pT1*(pT1-t1.a) * (pT1 - t1.b)*(pT1-t1.c));
        double areaY= Math.sqrt(pT2*(pT2-t2.a) * (pT2 - t2.b)*(pT2-t2.c));

        if (areaX> areaY){
            System.out.println("Area de t1 é maior que t2");
        }else{
            System.out.println("Area de t2 é maior que t1");
        }

    }
}

//Area do triangulo sem Orientação a objeto

public class AreaTrianguloSOO {
    public static void main(String[] args) {
        //primeiro triangulo
        double xa = 3.0, xb = 4.0, xc= 5.0;

        //segundo triangulo
        double ya = 7.5,yb = 4.5,yc = 4.02;

        double pDeX =(xa+xb+xc)/2; // p vem da formula de area
        double pDeY =(ya+yb+yc)/2;

        double areaX= Math.sqrt(pDeX*(pDeX-xa) * (pDeX - xb)*(pDeX-xc));
        double areaY= Math.sqrt(pDeY*(pDeY-ya) * (pDeY - yb)*(pDeY-yc));
        System.out.println("A area de x corresponde a: "+areaX);
        System.out.println("A area de y corresponde a: "+areaY);



        if (areaX > areaY){
            System.out.println("Area de X é maior que a de Y");
        } else{
            System.out.println("A area de Y é maior que a de X");
        }

    }
}

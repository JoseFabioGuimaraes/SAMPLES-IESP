package app;

import entidades.*;

public class app {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(colors.AZUL,2.5,2.5);
        Circulo c = new Circulo(colors.PRETO,5.0);
        Triangulo t = new Triangulo(colors.VERMELHO,3,5);

        //polomorfismo
        Forma f = new Quadrado(colors.VERMELHO,9.0,9.0);

        System.out.println("Area do quadrado " +q.calcularArea());
        System.out.println("Area do Circulo " +c.calcularArea());
        System.out.println("Area do Triangulo " +t.calcularArea());
        System.out.println("Area do Forma (quadrado) " +f.calcularArea());
    }
}

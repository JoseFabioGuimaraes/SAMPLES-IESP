package areatriangulo_oo;

import entidades.TrianguloCOO;

// COM ORIENTAÇÃO A OBJETOS
public class AreaTrianguloCOO {
     public static void main(String[] args) {

         TrianguloCOO tri = new TrianguloCOO(3.0,4.0,5.0);

         System.out.println("O valor de P: " + tri.calcularP());
         System.out.println("A areá é:" + tri.calcularArea());

         TrianguloCOO tri2 =  new TrianguloCOO(7.5,4.5,4.02);
         System.out.println("O valor de P do segundo triangulo é: "+ tri2.calcularP());
         System.out.println("O valor da Area do segundo triangulo é: "+tri2.calcularArea());

         if(tri.calcularArea()>tri2.calcularArea()){
             System.out.println("A area do primeiro é maior do que o do segundo");
         } else{
             System.out.println("A area do segundo é maior do que o do primeiro");
         }


     }

}

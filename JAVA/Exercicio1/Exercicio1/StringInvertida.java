import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua palavra");
        String palavra = scanner.nextLine();

        String palavraInvertida = "";

        for(int i = palavra.length() -1; i>=0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println("A string invertida é: "+palavraInvertida);
        scanner.close();
    }
}

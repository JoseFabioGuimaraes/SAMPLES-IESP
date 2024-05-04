import java.util.Arrays;
import java.util.Scanner;
public class palavraOrdenada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();

        int[] valores = new int[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            char ch = palavra.charAt(i);
            valores[i] = ch - 'a' + 1;
        }

        Arrays.sort(valores);

        StringBuilder resultado = new StringBuilder();
        for (int valor : valores) {
            resultado.append((char) ('a' + valor - 1));
        }

        System.out.println("Pegando a string  ");
        System.out.println(resultado);

        scanner.close();
    }
}

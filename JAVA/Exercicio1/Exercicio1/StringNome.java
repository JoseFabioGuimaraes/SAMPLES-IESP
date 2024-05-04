import java.util.Scanner;

public class StringNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCompleto = scanner.nextLine();

        String[] inciais = nomeCompleto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for(String letra : inciais){
            char inicial = Character.toUpperCase(letra.charAt(0));
            resultado.append(inicial).append(".");
        }
        System.out.println(resultado.toString());
    }
}

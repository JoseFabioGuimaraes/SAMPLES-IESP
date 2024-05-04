import java.util.Random;
import java.util.Scanner;

public class intervalo1p1000 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroRandom = gerador.nextInt(1000)+1;
        System.out.println(numeroRandom);
        int tentativas = 0;
        boolean acertou = false;

        while(!acertou){
            System.out.println("Digite o numero: ");
            int numeroEscolhido = scanner.nextInt();
            tentativas++;

            if(numeroEscolhido ==  numeroRandom){
                System.out.println("Parabéns você acertou \nCom um total de :"+tentativas+" Tentativas");
                acertou = true;
            } else if (numeroEscolhido<numeroRandom) {
                System.out.println("Numero digitado é menor que o numero sorteado. \nTente novamente; ");
            }else{
                System.out.println("Numero digitado é maior que o numero sorteado. \nTente novamente; ");
            }

        }
        scanner.close();
    }
}

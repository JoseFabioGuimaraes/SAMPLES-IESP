import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int n = scanner.nextInt();
        if(n <= 1){
            System.out.println("Digite um valor válido");
        } else {
            for (int i = 2; i< Math.sqrt(n); i++){
             if(n%i ==0){
                 System.out.println("Não é primo");
             }
            }
            System.out.println("É primo");
        }
        scanner.close();
    }
}
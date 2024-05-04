import java.sql.SQLOutput;
import java.util.Scanner;

public class app {
    //get e set
    public static void main(String[] args) {
        ContaCorrente CC = new ContaCorrente(200);
        CC.depositar(500);
        System.out.println("Valor depositado "+CC.getSaldo());
        CC.sacar(200);
        System.out.println("Valor sacado "+  CC.getSaldo());


    }
}

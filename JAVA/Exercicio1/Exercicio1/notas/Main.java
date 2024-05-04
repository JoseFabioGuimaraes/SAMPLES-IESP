package notas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while(true){
            System.out.println("Digite o nome do aluno (Ou digite 'sair'): ");
            String nome = scanner.nextLine();

            if(nome.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Digite a Primeira nota: ");
            int nota1= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a Segunda nota: ");
            int nota2= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a Terceira nota: ");
            int nota3= scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome,nota1,nota2,nota3);
            alunos.add(aluno);
        }

        int totalAlunos = alunos.size();
        int totalAprovados= 0;
        int totalReprovados = 0;
        int somaNotas = 0;

        System.out.println("Notas dos alunos: ");
        for(Aluno aluno: alunos){
            System.out.println("Aluno "+ aluno.getNome()+ " Notas:\n Primeira"+ aluno.nota1+
                    "\n Segunda: "+aluno.nota2+"\n Terceira: "+aluno.nota3);
            int media = aluno.calcularMedia();
            somaNotas += media;
            if(media>=6){
                totalAprovados++;
            }else{
                totalReprovados++;
            }
        }
        System.out.println("\nMedia geral da turma: "+(somaNotas/totalAlunos));
        System.out.println("Quantidade de aprovados: " + totalAprovados);
        System.out.println("Quantidade de reprovados: " + totalReprovados);
        System.out.println("\nAlunos aprovados: ");
        for(Aluno aluno:alunos){
            if(aluno.calcularMedia()>= 6){
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("Alunos reprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() < 6) {
                System.out.println(aluno.getNome());
            }
        }

        scanner.close();
    }
}

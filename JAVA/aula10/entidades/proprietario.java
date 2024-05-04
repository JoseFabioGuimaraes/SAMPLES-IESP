package entidades;
import java.util.Scanner;

public class proprietario extends User{
    private int numeroPropriedades;
    public proprietario(String nome,String email, String numero,int numeroPropriedades){
        super(nome,email, numero);
        this.numeroPropriedades = numeroPropriedades;
    }

    //get e set
    public int getNumeroPropriedades() {
        return numeroPropriedades;
    }

    public void setNumeroPropriedades(int numeroPropriedades) {
        this.numeroPropriedades = numeroPropriedades;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: "+getNome());
        System.out.println("Email: "+getEmail());
        System.out.println("Telefone: "+getNumero());
        System.out.println("Número de Propriedades: "+getNumeroPropriedades());

    }

    @Override
    public void editarPerfil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a edição de perfil: "+getNome());
        System.out.println("Digite seu novo nome(Ou deixe em branco para manter o atual):");
        String nome = scanner.nextLine().trim();
        if (!nome.isEmpty()){
            setNome(nome);
        }
        System.out.println("Digite seu novo email (Ou deixe em branco para manter o atual):");
        String email = scanner.nextLine().trim();
        if (!email.isEmpty()){
            setEmail(email);
        }
        System.out.println("Digite seu novo Telefone(Ou deixe em branco para manter o atual):");
        String telefone = scanner.nextLine().trim();
        if(!telefone.isEmpty()){
            setNumero(telefone);
        }

        System.out.println("Seu perfil foi atualizado com sucesso! :D");

    }

}

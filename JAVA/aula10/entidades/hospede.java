package entidades;

import java.util.Scanner;
import java.util.List;

public class hospede extends User {
    private List<Propriedade> propriedadesFavoritas;
    public hospede(String nome,String email,String telefone, List<Propriedade> propriedadesFavoritas){
        super(nome,email,telefone);
        this.propriedadesFavoritas = propriedadesFavoritas;
    }
    //get e set
    public List<Propriedade> getPropriedadesFavoritas() {
        return propriedadesFavoritas;
    }

    public void setPropriedadesFavoritas(List<Propriedade> propriedadesFavoritas) {
        this.propriedadesFavoritas = propriedadesFavoritas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: "+getNome());
        System.out.println("Email: "+getEmail());
        System.out.println("Telefone: "+getNumero());
        System.out.println("Propriedades favoritas: "+getPropriedadesFavoritas());

    }

    @Override
    public void editarPerfil() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Edição do perfil de hóspede");
        System.out.println("----------------------------");

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

        System.out.println("Edição concluída com sucesso! :D");
    }

}

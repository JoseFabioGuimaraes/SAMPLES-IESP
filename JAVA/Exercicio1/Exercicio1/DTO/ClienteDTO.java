package DTO;

public class ClienteDTO {
    private String nome, cpf, endereco, dataNascimento, telefone;

    public ClienteDTO(String nome, String cpf, String endereco, String dataNascimento, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }
}

package entidades;

public abstract class User {
    String email;
    String nome;
    String numero;

    public User(String email, String nome,String numero){
        this.email= email;
        this.nome = nome;
        this.numero = numero;
    }

    //get e set

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public abstract void exibirDados();
    public abstract void editarPerfil();
}

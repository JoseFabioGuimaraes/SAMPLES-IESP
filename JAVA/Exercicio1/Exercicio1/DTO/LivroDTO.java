package DTO;

public class LivroDTO {
    private String nome, autor,editora;
    private int quantPaginas;

    public LivroDTO(String nome, String autor, String editora, int quantPaginas){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.quantPaginas = quantPaginas;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }
}

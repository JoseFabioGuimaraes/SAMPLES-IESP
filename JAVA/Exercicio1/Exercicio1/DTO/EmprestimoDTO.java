package DTO;

public class EmprestimoDTO {

    private ClienteDTO cliente;
    private LivroDTO livro;
    private String dataEmprestimo, dataDevolucao;

    public EmprestimoDTO(ClienteDTO cliente, LivroDTO livro, String dataEmprestimo, String dataDevolucao){
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public LivroDTO getLivro() {
        return livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
}

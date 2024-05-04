package DTO;

public class Main {
    public static void main(String[] args) {
        ClienteDTO cliente = new ClienteDTO("José Fábio","123-456-789.00","Rua X","22/05/2002",
                "(83)98820-7912");
        LivroDTO livro = new LivroDTO("Percy jackson e o ladrão de raios","Rick Riordan","Intrínseca",402);
        String dataEmprestimo ="03/01/2024";
        String dataDevolucao = "10/03/2024";

        EmprestimoDTO emprestimo = new EmprestimoDTO(cliente,livro,dataEmprestimo,dataDevolucao);

        System.out.println("Informações do empréstimo: ");
        System.out.println(" Cliente: "+ emprestimo.getCliente().getNome());
        System.out.println(" Livro: "+ emprestimo.getLivro().getNome());
        System.out.println(" Data de emprestimo: "+ emprestimo.getDataEmprestimo());
        System.out.println(" Data de devolução: "+ emprestimo.getDataDevolucao());
    }
}

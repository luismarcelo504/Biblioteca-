import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarLivro(String titulo, String autor, int ano) {
        Livro livro = new Livro(proximoId, titulo, autor, ano);
        livros.add(livro);
        System.out.println("Livro adicionado! ID = " + proximoId);
        proximoId++;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE LIVROS =====");
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getId() +
                    " | Título: " + livro.getTitulo() +
                    " | Autor: " + livro.getAutor() +
                    " | Ano: " + livro.getAno() +
                    " | Emprestado: " + (livro.isEmprestado() ? "Sim" : "Não"));
        }
    }

    public void emprestarLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (!livro.isEmprestado()) {
                    livro.emprestar();
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Este livro já está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (livro.isEmprestado()) {
                    livro.devolver();
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Este livro não está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

import java.util.Scanner;

public class Servicos {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("[1] Adicionar livro");
            System.out.println("[2] Listar livros");
            System.out.println("[3] Emprestar livro");
            System.out.println("[4] Devolver livro");
            System.out.println("[5] Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor do livro: ");
                    String autor = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.adicionarLivro(titulo, autor, ano);
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("ID do livro para emprestar: ");
                    int idEmprestar = scanner.nextInt();
                    biblioteca.emprestarLivro(idEmprestar);
                    break;

                case 4:
                    System.out.print("ID do livro para devolver: ");
                    int idDevolver = scanner.nextInt();
                    biblioteca.devolverLivro(idDevolver);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

import java.util.Scanner;

public class Menu {
    private static Gestao gestao = new Gestao();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do{
            System.out.println("\nMENU DE GERENCIAMENTO DO MERCADO");
            System.out.println("\n(1) adicionar produto");
            System.out.println("(2) listar produtos");
            System.out.println("(3) buscar produto");
            System.out.println("(4) atualizar produto");
            System.out.println("(5) remover produto");
            System.out.println("(6) sair");

            System.out.println("\ndigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    buscarProduto();
                    break;
                case 4:
                    atualizarProduto();
                    break;
                case 5:
                    removerProduto();
                    break;
                case 6:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        }while(opcao != 6);
    }

    private static void adicionarProduto(){
        System.out.println("digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("digite o preco do produto: ");
        String preco = scanner.nextLine();
        System.out.println("digite a quantidade quantidade do produto: ");
        String quantidade = scanner.nextLine();
        System.out.println("digite o codigo do produto: ");
        String codigo = scanner.nextLine();

        Produtos produtos = new Produtos(nome, preco, quantidade, codigo);
        gestao.adicionarProduto(produtos);
    }

    private static void listarProdutos(){
        gestao.listarProdutos();
    }

    private static void buscarProduto(){
        System.out.println("digite o nome do seu contato: ");
        String nome = scanner.nextLine();
        Produtos produtos = gestao.buscarProduto(nome);

        if(produtos != null){
            System.out.println("produto encontrado: " + produtos);
        }
        else {
            System.out.println("produto não encontrado!");
        }
    }

    private static void atualizarProduto(){
        System.out.println("digite o produto que deseja atualizar: ");
        String nome = scanner.nextLine();

        System.out.println("digite o novo preco: ");
        String novoPreco = scanner.nextLine();

        System.out.println("digite a nova quantidade: ");
        String novaQuantidade = scanner.nextLine();

        gestao.atualizarProduto(nome, novoPreco, novaQuantidade);
    }

    private static void removerProduto(){
        System.out.println("digite o nome do produto que deseja remover: ");
        String nome = scanner.nextLine();
        gestao.removerProduto(nome);
    }
}

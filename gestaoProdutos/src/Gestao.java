import java.util.ArrayList;
import java.util.List;

public class Gestao {
    private List<Produtos> produtos;

    public Gestao(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produtos produto){
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public Produtos buscarProduto(String nome){
        for(Produtos produto : produtos){
            if(produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("nenhum produto adicionado.");
        }
        else {
            for(Produtos produto : produtos){
                System.out.println(produto);
            }
        }
    }

    public void atualizarProduto(String nome, String novoPreco, String novaQuantidade) {
        Produtos produto = buscarProduto(nome);
        if(produto != null) {
            produto.setPreco(novoPreco);
            produto.setQuantidade(novaQuantidade);
            System.out.println("produto atualizado com sucesso!");
        }
        else{
            System.out.println("produto nao encontrado.");
        }
    }

    public void removerProduto(String nome){
        Produtos produto = buscarProduto(nome);
        if(produto != null){
            produtos.remove(produto);
            System.out.println("produto removido com sucesso!");
        }
        else {
            System.out.println("produto nao encontrado");
        }
    }
}

public class Produtos {

    private String nome;
    private String preco;
    private String quantidade;
    private String codigo;

    public Produtos(String nome, String preco, String quantidade, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\nProduto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade + "\nCódigo: " + codigo;
    }
}

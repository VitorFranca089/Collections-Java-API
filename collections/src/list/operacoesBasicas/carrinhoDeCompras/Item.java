package list.operacoesBasicas.carrinhoDeCompras;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return "Item: " + nome + ". Preço: R$" + String.format("%.2f", preco) + ". Quantidade: " + quantidade + ".";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}

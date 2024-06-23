package list.operacoesBasicas.carrinhoDeCompras;

public class Teste {

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adiciona itens na compra
        carrinho.adicionarItem("Arroz", 23.14, 1);
        carrinho.adicionarItem("Açúcar", 17.14, 2);
        carrinho.adicionarItem("Sabonete", 3.50, 6);
        carrinho.adicionarItem("Refrigerante", 6.54, 2);

        // Exibe itens e preço no carrinho
        carrinho.exibirItens();
        System.out.println("Total: " + String.format("%.2f", carrinho.calcularValorTotal()));

        // Remove itens do carrinho
        carrinho.removerItem("Arroz");

        // Exibe itens e preço no carrinho
        carrinho.exibirItens();
        System.out.println("Total: " + String.format("%.2f", carrinho.calcularValorTotal()));

    }

}

package map.pesquisa.estoqueProdutosPreco;

public class Teste {

    public static void main(String[] args) {
        
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adiciona produtos
        estoque.adicionarProduto(102L, "Feijão", 30, 7.50);
        estoque.adicionarProduto(103L, "Macarrão", 40, 4.75);
        estoque.adicionarProduto(104L, "Azeite", 20, 15.90);
        estoque.adicionarProduto(101L, "Arroz", 50, 20.99);

        estoque.exibirProduto();

        // Valor total do estoque
        System.out.println("Valor total do estoque: R$" + String.format("%.2f", estoque.calcularValorTotalEstoque()));

        // Produto mais caro
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        
        // Produto mais barato
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        // Produto maior quantidade
        System.out.println("Produto maior qtde: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    
    }

}

package set.ordenacao.cadastroDeProdutos;

public class Teste {

    public static void main(String[] args) {
        
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionando produto
        cadastro.adicionarProduto(1010, "Arroz", 25.54, 2);
        cadastro.adicionarProduto(1011, "Feijão", 16.4, 4);
        cadastro.adicionarProduto(1012, "Carne", 30.23, 1);
        cadastro.adicionarProduto(1013, "Alface", 3.77, 2);

        System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println(cadastro.exibirProdutosPorPreco());

    }

}

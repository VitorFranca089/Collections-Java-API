package map.ordenacao.livrariaOnline;

public class Teste {

    public static void main(String[] args) {
        
        LivrariaOnline amazon = new LivrariaOnline();
    
        // Adiciona livro
        amazon.adicionarLivro("www.amazon.com/ms", "Memórias Póstumas de Brás Cubas", "Machado de Assis", 30.23);
        amazon.adicionarLivro("www.amazon.com/cl", "A Paixão Segundo G.H.", "Clarice Lispector", 29.31);
        amazon.adicionarLivro("www.amazon.com/tk/lor", "O Senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", 115.75);

        amazon.exibirLivrosOrdenadosPorPreco();

        // Remove livro
        amazon.removerLivro("Memórias Póstumas de Brás Cubas");

        amazon.exibirLivrosOrdenadosPorPreco();

        // Pesquisa por autos
        amazon.pesquisarLivrosPorAutor("J. R. R. Tolkien");

        // Mais caro
        amazon.obterLivroMaisCaro();

        // Mais barato
        amazon.obterLivroMaisBarato();
        
    }

}

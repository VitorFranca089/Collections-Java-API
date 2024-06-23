package list.pesquisa.catalogoDeLivros;

public class Teste {

    public static void main(String[] args) {
        
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adiciona Livros
        catalogo.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        catalogo.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        catalogo.adicionarLivro("A Paixão Segundo G.H.", "Clarice Lispector", 1964);
        catalogo.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", 1954);

        // Pesquisa por autor
        System.out.println(catalogo.pesquisarPorAutor("J. R. R. Tolkien"));

        // Pesquisa por intervalo de anos
        System.out.println(catalogo.pesquisarPorAno(1900, 2000));

        // Pesquisa por título
        System.out.println(catalogo.pesquisarPorTitulo("A Paixão Segundo G.H."));

    }

}

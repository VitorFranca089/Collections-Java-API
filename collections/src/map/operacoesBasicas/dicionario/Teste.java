package map.operacoesBasicas.dicionario;

public class Teste {

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();

        // Adiciona palavra
        dicionario.adicionarPalavra("Sol", "A estrela no centro do nosso sistema solar");
        dicionario.adicionarPalavra("Lua", "O satélite natural da Terra");
        dicionario.adicionarPalavra("Casa", "Edificação para habitação");
        dicionario.adicionarPalavra("Livro", "Conjunto de folhas de papel impressas e encadernadas, formando um volume");
        dicionario.adicionarPalavra("Cachorro", "Animal mamífero, doméstico, considerado o melhor amigo do homem");

        dicionario.exibirPalavras();

        // Remover palavra
        dicionario.removerPalavra("Livro");

        dicionario.exibirPalavras();

        // Pesquisa por palavra
        System.out.println(dicionario.pesquisarPorPalavra("Lua"));

    }

}

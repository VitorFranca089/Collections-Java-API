package map.pesquisa.contagemPalavras;

public class Teste {

    public static void main(String[] args) {
        
        ContagemPalavras contagem = new ContagemPalavras();

        // Adiciona palavra
        contagem.adicionarPalavra("Olá", 6);
        contagem.adicionarPalavra("Boa", 5);
        contagem.adicionarPalavra("Tarde", 10);
        contagem.adicionarPalavra("Noite", 44);

        contagem.exibirContagemPalavras();

        // Remove palavra
        contagem.removerPalavra("Boa");

        contagem.exibirContagemPalavras();

        // Palavra mais frequente
        System.out.println(contagem.encontrarPalavraMaisFrequente());

    }

}

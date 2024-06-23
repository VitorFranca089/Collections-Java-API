package set.operacoesBasicas.conjuntoPalavrasUnicas;

public class Teste {

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        // Adiciona palavras
        conjuntoPalavras.adicionarPalavra("Banana");
        conjuntoPalavras.adicionarPalavra("Batata");
        conjuntoPalavras.adicionarPalavra("Maçã");
        conjuntoPalavras.adicionarPalavra("Banana");
        conjuntoPalavras.adicionarPalavra("Limão");

        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.verificarPalavra("Limão");

        // Removendo palavra
        conjuntoPalavras.removerPalavra("Limão");

        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.verificarPalavra("Limão");

    }

}

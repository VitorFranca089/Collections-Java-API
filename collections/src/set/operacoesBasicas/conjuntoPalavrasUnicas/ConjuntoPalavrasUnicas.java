package set.operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas(){
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavraSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        if(palavraSet.contains(palavra)){
            System.out.println("Palavra '" + palavra + "' está no conjunto.");
        }else{
            System.out.println("Não está no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

}

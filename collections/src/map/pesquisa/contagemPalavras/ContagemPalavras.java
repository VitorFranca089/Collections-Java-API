package map.pesquisa.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemMap;

    public ContagemPalavras(){
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemMap);
    }

    public String encontrarPalavraMaisFrequente(){
        String maisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemMap.entrySet()){
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                maisFrequente = entry.getKey();
            }
        }
        return maisFrequente;
    }

}

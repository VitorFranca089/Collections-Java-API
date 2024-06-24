package map.operacoesBasicas.agendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!contatoMap.isEmpty()){
            contatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!contatoMap.isEmpty()){
            numeroPorNome = contatoMap.get(nome);
        }
        return numeroPorNome;
    }

}

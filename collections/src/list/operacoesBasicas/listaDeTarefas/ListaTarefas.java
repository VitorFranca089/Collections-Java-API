package list.operacoesBasicas.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    public List<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        tarefas.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String tarefa){
        List<Tarefa> tarefasRemovidas = new ArrayList<>();
        for(Tarefa t : tarefas){
            if(tarefa.equalsIgnoreCase(t.getDescricao())){
                tarefasRemovidas.add(t);
            }
        }
        tarefas.removeAll(tarefasRemovidas);
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> descricoesTarefas = new ArrayList<>();
        for (Tarefa t : tarefas) {
            descricoesTarefas.add(t.getDescricao());
        }
        return descricoesTarefas;
    }

}

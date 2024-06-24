package set.pesquisa.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(t);
                break;
            }
        }    
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if(t.isConclusao()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if(!t.isConclusao()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConclusao(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConclusao(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

}

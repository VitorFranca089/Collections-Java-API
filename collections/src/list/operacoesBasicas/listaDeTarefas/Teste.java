package list.operacoesBasicas.listaDeTarefas;

public class Teste {

    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Ler um livro");
        listaTarefas.adicionarTarefa("Caminhar");
        listaTarefas.adicionarTarefa("Ir ao cinema"); // Repetição proposital
        listaTarefas.adicionarTarefa("Ir ao cinema");
        listaTarefas.adicionarTarefa("Ir ao cinema");

        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        // Removendo tarefa
        listaTarefas.removerTarefa("ir ao cinema");

        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());


        // Adiocionando mais uma tarefa
        listaTarefas.adicionarTarefa("Ir para faculdade");

        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());


    }

}

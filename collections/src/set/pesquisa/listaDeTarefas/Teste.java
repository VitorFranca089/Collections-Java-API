package set.pesquisa.listaDeTarefas;

public class Teste {

    public static void main(String[] args) {
        
        ListaTarefas lista = new ListaTarefas();

        // Adiciona tarefa
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Ir ao cinema");
        lista.adicionarTarefa("Fazer bolo");
        lista.adicionarTarefa("Caminhar");
        lista.adicionarTarefa("Limpar o chão");

        lista.exibirTarefas();
        System.out.println(lista.contarTarefas());

        // Remove tarefa
        lista.removerTarefa("Limpar o chão");

        lista.exibirTarefas();
        System.out.println(lista.contarTarefas());

        // Tarefas Concluidas
        System.out.println(lista.obterTarefasConcluidas());

        // Tarefas Pendentes
        System.out.println(lista.obterTarefasPendentes());

        // Marcar concluida
        lista.marcarTarefaConcluida("Estudar Java");
        lista.marcarTarefaConcluida("Caminhar");
        lista.marcarTarefaConcluida("Ir ao cinema");

        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());

        // Marcar pendente
        lista.marcarTarefaPendente("Caminhar");

        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());

        // Limpar lista
        lista.limparListaTarefas();

        lista.exibirTarefas();

    }

}

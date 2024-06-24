package map.operacoesBasicas.agendaDeContatos;

public class Teste {

    public static void main(String[] args) {
        
        AgendaContatos agenda = new AgendaContatos();

        // Adiciona contato
        agenda.adicionarContato("Vitor", 1001);
        agenda.adicionarContato("Bia", 1023);
        agenda.adicionarContato("Carol", 1543);
        agenda.adicionarContato("Matheus", 1969);

        agenda.exibirContatos();

        // Remove contato
        agenda.removerContato("Carol");

        agenda.exibirContatos();

        // Pesquisa por nome
        System.out.println(agenda.pesquisarPorNome("Matheus"));

    }

}

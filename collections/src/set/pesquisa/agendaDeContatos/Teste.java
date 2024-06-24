package set.pesquisa.agendaDeContatos;

public class Teste {

    public static void main(String[] args) {
        
        AgendaContatos agenda = new AgendaContatos();

        // Adiciona contato
        agenda.adicionarContato("Vitor Franca", 987654);
        agenda.adicionarContato("Vitor", 902345);
        agenda.adicionarContato("Matheus", 966904);
        agenda.adicionarContato("Bia", 344);

        agenda.exibirContatos();

        // Pesquisa por nome
        agenda.pesquisarPorNome("Vitor");

        // Atualiza contato
        agenda.atualizarNumeroContato("Bia", 1231231);

        agenda.exibirContatos();

    }

}

package map.ordenacao.agendaDeEventos;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        
        AgendaEventos agenda = new AgendaEventos();

        // Adiciona evento
        agenda.adicionarEvento(LocalDate.of(2024, 12, 25), "Natal Animado", "Papai Noel");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 10), "Circo", "Palhaçadas");
        agenda.adicionarEvento(LocalDate.of(2023, 7, 15), "Festival de Música", "Aulas de música");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }

}

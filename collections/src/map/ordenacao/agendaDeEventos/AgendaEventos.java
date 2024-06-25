package map.ordenacao.agendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();
        //eventosMap.get();

        LocalDate today = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate dataEvento = null;
        String proximoEvento = null;

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(today) || entry.getKey().isAfter(today)){
                dataEvento = entry.getKey();
                proximoEvento = entry.getValue().getNome();
                System.out.println("O próximo evento (" + proximoEvento + ") acontecerá: " + dataEvento);
                break;
            }
        }

    }

}

package list.ordenacao.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionaNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numAscendente = new ArrayList<>(numerosList);
        Collections.sort(numAscendente);
        return numAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numDescendente = new ArrayList<>(numerosList);
        numDescendente.sort(Collections.reverseOrder());;
        return numDescendente;
    }

}
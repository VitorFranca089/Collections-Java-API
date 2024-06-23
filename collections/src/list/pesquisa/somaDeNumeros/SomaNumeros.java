package list.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int i : numerosList){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = numerosList.get(0);
        for(int i : numerosList){
            if(maior < i){
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = numerosList.get(0);
        for(int i : numerosList){
            if(menor > i){
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(numerosList.toString());
    }

}

package list.ordenacao.ordenacaoNumeros;

public class Teste {

    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        // Adiciona numeros
        ordenacao.adicionaNumero(1);
        ordenacao.adicionaNumero(4);
        ordenacao.adicionaNumero(-5);
        ordenacao.adicionaNumero(100);
        ordenacao.adicionaNumero(40);

        // Ordena por ordem Ascendente
        System.out.println(ordenacao.ordenarAscendente());
        
        // Ordena por ordem Descendente
        System.out.println(ordenacao.ordenarDescendente());

    }

}

package list.pesquisa.somaDeNumeros;

public class Teste {

    public static void main(String[] args) {
        
        SomaNumeros soma = new SomaNumeros();

        // Adiciona números
        soma.adicionarNumero(0);
        soma.adicionarNumero(2);
        soma.adicionarNumero(4);
        soma.adicionarNumero(10);
        soma.adicionarNumero(-6);

        // Cálculo da soma
        System.out.println(soma.calcularSoma());

        // Maior número
        System.out.println(soma.encontrarMaiorNumero());
        
        // Menor número
        System.out.println(soma.encontrarMenorNumero());
        
        // Exibe todos os números
        soma.exibirNumeros();
        
    }

}

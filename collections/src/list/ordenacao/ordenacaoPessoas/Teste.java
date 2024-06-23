package list.ordenacao.ordenacaoPessoas;

public class Teste {

    public static void main(String[] args) {
        
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();

        // Adiciona pessoa
        ordenacao.adicionarPessoa("Ana", 25, 1.65);
        ordenacao.adicionarPessoa("Bruno", 30, 1.80);
        ordenacao.adicionarPessoa("Carla", 22, 1.55);
        ordenacao.adicionarPessoa("Diego", 28, 1.75);
        ordenacao.adicionarPessoa("Eduarda", 27, 1.68);

        // Ordena por idade
        System.out.println(ordenacao.ordenarPorIdade());
        
        // Ordena por altura
        System.out.println(ordenacao.ordenarPorAltura());

    }

}

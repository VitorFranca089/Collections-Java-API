package set.operacoesBasicas.conjuntoConvidados;

public class Teste {

    public static void main(String[] args) {
        
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        // Adiciona convidados
        convidados.adicionarConvidado("João", 101);
        convidados.adicionarConvidado("Maria", 102);
        convidados.adicionarConvidado("Bia", 103);
        convidados.adicionarConvidado("Carol", 104);
        convidados.adicionarConvidado("Paola", 103); // Desconsiderada por conta do codigoConvite duplicado

        convidados.exibirConvidados();
        convidados.contarConvidados();

        // Remove convidado
        convidados.removerConvidadoPorCodigoConvite(104);

        convidados.exibirConvidados();
        convidados.contarConvidados();

    }

}

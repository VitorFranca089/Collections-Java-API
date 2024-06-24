package set.ordenacao.listaDeAlunos;

public class Teste {

    public static void main(String[] args) {
        
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        // Adiciona aluno
        alunos.adicionarAluno("Vitor", 1010L, 9.8);
        alunos.adicionarAluno("Alice", 1011L, 4.6);
        alunos.adicionarAluno("Bia", 1012L, 7.5);
        alunos.adicionarAluno("Matheus", 1013L, 10);

        alunos.exibirAlunos();
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());

        // Remove aluno
        alunos.removerAluno(1011L);

        alunos.exibirAlunos();
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());

    }

}

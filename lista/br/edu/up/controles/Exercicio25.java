package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;

public class Exercicio25 {
    public static void executar() {
        /*Programa que classifica um aluno de acordo com sua nota */

        Aluno aluno  = new Aluno(1);

        Prompt.imprimir("Nome:");
        aluno.setNome(Prompt.lerLinha());
        Prompt.imprimir("Matrícula:");
        aluno.setMatricula(Prompt.lerLinha());
        Prompt.imprimir("Nota do laboratório:");
        aluno.setNota1(Prompt.lerDecimal());
        Prompt.imprimir("Nota da prova semestral:");
        aluno.setNota2(Prompt.lerDecimal());
        Prompt.imprimir("Nota da prova final:");
        aluno.setNota3(Prompt.lerDecimal());

        aluno.mediaPonderada(aluno.getNota1(),aluno.getNota2(),aluno.getNota3());

        aluno.setClassificacao(aluno.getMedia());

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[ " + aluno.getNome() + " ]");
        Prompt.imprimir("[ " + aluno.getMatricula() + " ]");
        System.out.printf("[Média final] %.2f\n",aluno.getMedia());
        Prompt.imprimir("[Classificação] " + aluno.getClassificacao());
        Prompt.linhaEmBranco();
        Prompt.separador();

    }
}

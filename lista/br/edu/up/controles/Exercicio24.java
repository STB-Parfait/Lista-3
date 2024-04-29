package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio24 {
    public static void executar() {
        /*Programa que calcula a média ponderada de um aluno */

        Aluno aluno = new Aluno(1);
        
        Prompt.imprimir("Nota do laboratório:");
        aluno.setNota1(Prompt.lerDecimal());
        Prompt.imprimir("Nota da avaliação semestral:");
        aluno.setNota2(Prompt.lerDecimal());
        Prompt.imprimir("Nota da avaliação final:");
        aluno.setNota3(Prompt.lerDecimal());

        aluno.mediaPonderada(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Média final] " + aluno.getMedia());
        Prompt.linhaEmBranco();
        Prompt.separador();

    }
}

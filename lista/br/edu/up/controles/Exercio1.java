package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Aluno;
import lista.br.edu.up.util.Prompt;

public class Exercio1 {
    public static void executar() {
/*1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteveno semestre. 
No final informar o nome do aluno e a sua média (aritmética).*/

    double nota1 = Prompt.lerDecimal();
    double nota2 = Prompt.lerDecimal();
    double nota3 = Prompt.lerDecimal();
    String nome = Prompt.lerLinha();

    Aluno aluno1 = new Aluno(nome, nota1, nota2, nota3);
    aluno1.calcularmedia();

    System.out.printf("Nome: %s\n", aluno1.getNome());
    System.out.printf("Média: %.1f", aluno1.getMedia());

    }
}

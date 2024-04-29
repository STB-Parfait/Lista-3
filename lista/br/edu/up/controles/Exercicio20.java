package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio20 {
    public static void executar() {
        /*Programa que calcula o salário de um professor */

        Professor professor = new Professor();

        Prompt.imprimir("Insira o nível do professor:");
        professor.setNivel(Prompt.lerInteiro());
        Prompt.imprimir("Insira as horas semanais do professor:");
        professor.setHoras(Prompt.lerInteiro());
        
        professor.setSal();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Salário] " + (professor.getSalario()*4));
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}

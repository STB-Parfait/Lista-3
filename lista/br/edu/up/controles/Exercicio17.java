package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio17 {
    public static void executar() {
        /*Programa que calcula a porcentagem de aumento do salário de um funcionário */
        
        Funcionario funcionario = new Funcionario();

        Prompt.imprimir("nome:");
        funcionario.setNome(Prompt.lerLinha());
        Prompt.imprimir("Salário atual:");
        funcionario.setSalario(Prompt.lerDecimal());

        funcionario.calcMed();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Atual] " + funcionario.getSalario());
        Prompt.imprimir("[Reajustado] " + funcionario.getNsalario());

        Prompt.imprimir("[% aumento] " + (funcionario.getMed()*100) + "%");
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}

package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio16 {
    public static void executar() {
        /*Programa que calcula o reajuste no salário dos funcionários de uma empresa */

        double min = 1400.12;
        double numsal;
        Funcionario tst = new Funcionario();

        tst.setSalario(Prompt.lerDecimal());

        numsal = tst.getSalario()/min;

        if(numsal>10&&numsal<=20){
            tst.setNsalario(tst.getSalario()+(tst.getSalario()*0.15));
        }
        else if(numsal>3&&numsal<=10){
            tst.setNsalario(tst.getSalario()+(tst.getSalario()*0.20));
        }
        else if(numsal<3){
            tst.setNsalario(tst.getSalario()+(tst.getSalario()*0.50));
        }
        else{
            tst.setNsalario(tst.getSalario()+(tst.getSalario()*0.10));
        }

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Atual] " + tst.getSalario());
        Prompt.imprimir("[Reajustado] " + tst.getNsalario());
        
    }
}

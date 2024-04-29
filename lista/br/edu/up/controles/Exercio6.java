package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.CustoEVenda;
import lista.br.edu.up.util.Prompt;

public class Exercio6 {
    public static void executar() {
        /*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
        Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário*/

        CustoEVenda venda1 = new CustoEVenda();

        venda1.setPrecoCusto(Prompt.lerDecimal("Valor total de custo: "));

        venda1.setPercAcrecimo(Prompt.lerDecimal("Porcentagem de acrecimo: "));

        String calcVal = String.format("%.2f", venda1.calcularValorVenda()).replace(",", ".");

        Prompt.imprimir("Valor de venda: R$" + calcVal);
        
    }
}



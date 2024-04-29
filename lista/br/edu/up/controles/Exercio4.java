package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Dinheiro;
import lista.br.edu.up.util.Prompt;

public class Exercio4 {
    public static void executar() {
/*4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor lido em dólar 
(US$). O programa deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com 
o usuário*/

        double qtd = Prompt.lerDecimal("Quantidade de dinheiro com o usuário: ");

        Dinheiro dolarParaReal = new Dinheiro(qtd);

        dolarParaReal.setCotacao(Prompt.lerDecimal("Valor da cotação atual do dolar: (US$)"));

        Prompt.imprimir("Valor em Reais da quantia informada: R$"+dolarParaReal.calcularValReais());
        
    }
}



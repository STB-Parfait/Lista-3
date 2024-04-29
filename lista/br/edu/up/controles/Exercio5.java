package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.PrestacaoMCA;
import lista.br.edu.up.util.Prompt;

public class Exercio5 {
    public static void executar() {
/*5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.Faça um programa 
que receba um valor de uma compra e mostre o valor das prestações.*/

        double total = Prompt.lerDecimal("Valor total do produto: R$");

        PrestacaoMCA produto1 = new PrestacaoMCA(total);
        produto1.setValCompra(total);
        produto1.calcularPrestacao();

        System.out.printf("Valor de cada prestação: R$ %.2f", produto1.getValPrestacao());

    
    }
}



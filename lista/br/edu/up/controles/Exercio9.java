package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Intervalo10a150;
//import lista.br.edu.up.util.Prompt;

public class Exercio9 {
    public static void executar() {
        /*9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 
        (inclusive).*/
        Intervalo10a150 num1 = new Intervalo10a150(); 
        num1.setCont(num1.calcularContador());

        System.out.printf("Qtd de numeros entre 10 e 150: %d", num1.getCont());
    }
}

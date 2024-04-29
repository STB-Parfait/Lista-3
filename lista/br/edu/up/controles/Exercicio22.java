package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio22 {
    public static void executar() {
        /*Programa que calcula a conta de luz de um endereço */

        double conta = 0;

        Consumidor casa = new Consumidor();

        Prompt.imprimir("Insira o tipo de consumidor");
        Prompt.imprimir("[industria] [comercio] [residencia]");
        casa.setTipo(Prompt.lerLinha());
        Prompt.imprimir("Insira o consumo [em Kw/h]:");
        casa.setConsumo(Prompt.lerInteiro());


        //horarios de funcionamento foram assumidos como:
        //comercio 16h em escala 5x2
        //industria 16h em escala 6x1
        //residencial 12h todos os dias

        conta = casa.calcLuz(casa.getTipo(), casa.getConsumo());

        Prompt.separador();
        Prompt.linhaEmBranco();
        System.out.printf("[Conta de luz mensal]: %.2fR$\n", conta);
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}

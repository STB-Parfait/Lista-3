package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio15 {
    public static void executar() {
        /*Programa que mostra o desconto no valor de um carro considerando seu tipo de combustível */

        Carro cview = new Carro();

        cview.setNome(Prompt.lerLinha());
        cview.setPreco(Prompt.lerDecimal());
        cview.setCombustivel(Prompt.lerLinha());

        switch(cview.getCombustivel()){
            case "gasolina":
            cview.setPreco(cview.getPreco()-(cview.getPreco()*0.25));
            break;

            case "alcool":
            cview.setPreco(cview.getPreco()-(cview.getPreco()*0.21));
            break;

            case "diesel":
            cview.setPreco(cview.getPreco()-(cview.getPreco()*0.14));
            break;
        }

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Informações do veículo]");
        Prompt.imprimir("[Nome] " + cview.getNome());
        Prompt.imprimir("[Combustível] " + cview.getCombustivel());
        Prompt.imprimir("[Preço] " + cview.getPreco());
        Prompt.linhaEmBranco();
        Prompt.imprimir("*O campo [preço] já reflete os descontos vigentes");
    }
}

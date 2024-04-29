package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio14 {
    public static void executar() {
        /*programa que recebe o custo e o preço de venda de 40 produtos. Mostra se houve lucro, prejuízo ou empate
        para cada produto, além da média de custo e do preço de venda.*/

        int x;
        double meda=0,medb=0;

        Produto[] itens = new Produto[40];

        for(x=0;x<4;x++){
            
            Produto item = new Produto();

            Prompt.imprimir("Custo do item (" + (x+1) + ")");
            item.setPriceC(Prompt.lerDecimal());

            Prompt.imprimir("Preço do item (" + (x+1) + ")");
            item.setPriceV(Prompt.lerDecimal());

            itens[x] = item;
        }

        for(x=0;x<40;x++){
            meda=meda+itens[x].getPriceC();
            medb=medb+itens[x].getPriceV();
        }
        meda=meda/x;
        medb=medb/x;

        Prompt.imprimir(meda);
        Prompt.imprimir(medb);

        if(meda>medb){
            Prompt.imprimir("Prejuízo");
        }
        else if(meda<medb){
            Prompt.imprimir("Lucro");
        }
        else{
            Prompt.imprimir("Empate");
        }
    }
}

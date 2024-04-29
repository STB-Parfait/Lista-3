package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.CustoAoConsumidor;
import lista.br.edu.up.util.Prompt;

public class Exercio7 {
    public static void executar() {
        /*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
        distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois apercentagem 
        do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%.
        Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */

        double custoFab = Prompt.lerDecimal("Preço de fábrica: ");

        CustoAoConsumidor carro1 = new CustoAoConsumidor(custoFab);
        
        carro1.calcularCustoTotal();
     
        System.out.printf("Preço de custo: R$ %.2f\n", carro1.getCustoFabrica());
        System.out.printf("Preço total para o consumidor: R$ %.2f", carro1.getCustoTotal());
    }
}


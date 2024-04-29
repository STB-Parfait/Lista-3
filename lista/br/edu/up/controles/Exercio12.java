package lista.br.edu.up.controles;

import java.util.ArrayList;
import java.util.Calendar;

import lista.br.edu.up.modelos.CarangoVelho;
import lista.br.edu.up.util.Prompt;

public class Exercio12 {
    public static void executar() {
        
        /*12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
        Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
        O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000- 12% e acima de 2000 - 7%. O sistema 
        deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
        Informar total de carros com ano até 2000 e total geral.*/

        String continuar;
        int totCarro2000 = 0;
        ArrayList<CarangoVelho> lista = new ArrayList<CarangoVelho>();
        boolean valido;

        Calendar cal = Calendar.getInstance();

        int anoAtual = cal.get(Calendar.YEAR);

        do{
            CarangoVelho carro = new CarangoVelho();

            carro.setPrecoCarro(Prompt.lerDecimal("Qual o preço do Carro: "));

            do{
                valido = false;
                carro.setAno(Prompt.lerInteiro("Qual o ano do Carro: "));

                if(carro.getAno() < 1900 || carro.getAno() > anoAtual){
                    Prompt.imprimir("Ano inválido");
                }
                else{
                    valido = true;
                    if(carro.getAno() <= 2000){
                        carro.setDesconto(0.12);
                        totCarro2000++;

                    }else if(carro.getAno() > 2000){
                        carro.setDesconto(0.07);
                    }
                    carro.calcularPrecoFinal();
                }
            }while(valido == false);

                continuar = Prompt.lerLinha("Continuar(s/n):");    
                lista.add(carro);

        }while(continuar.charAt(0) == 's' || continuar.charAt(0) == 'S');

        Prompt.separador();
        int j = 1;
        for (CarangoVelho i : lista) {
            String td = String.format("%.0f", (i.getDesconto() * 100));
            
            Prompt.imprimir("== Carro "+ j+" ==");
            Prompt.imprimir("Preço inicial: R$"+i.getPrecoCarro());
            Prompt.imprimir("Ano: "+ i.getAno());
            Prompt.imprimir("Desconto: "+ (td) + "%");
            Prompt.imprimir("\n-->Preço final: R$"+ i.getPrecoFinal());
            j++;
        }
        Prompt.separador();
        Prompt.imprimir("Total de carros que são até os anos 2000: " + totCarro2000);
        Prompt.separador();

    }
}


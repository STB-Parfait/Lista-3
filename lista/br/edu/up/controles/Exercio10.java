package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Idades;
import lista.br.edu.up.util.Prompt;

public class Exercio10 {
    public static void executar() {
        /*10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensageminformando 
        “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade.*/

        //resposta
        int n = Prompt.lerInteiro("Quantas pessoas serão registradas: ");
        int[] idades = new int[n];
        Idades pessoa = new Idades(n);


        Prompt.separador();

        for (int i = 0; i < pessoa.getNumPessoas(); i++) {

            idades[i] = Prompt.lerInteiro("idade pessoa["+ (i+1) +"]:");

            pessoa.setIdades(idades);

            if(idades[i] >= 18){
                Prompt.imprimir("-->Maior de idade\n");
            }
            else{
                Prompt.imprimir("-->Menor de idade\n");
                
            }
        }
        
        Prompt.separador();
    }
}


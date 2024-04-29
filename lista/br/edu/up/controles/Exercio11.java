package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Sexo;
import lista.br.edu.up.util.Prompt;

public class Exercio11 {
    public static void executar() {
        /*11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. 
        No final informe total de homens e de mulheres.*/

        int M = 0;
        int H = 0;
    
            Sexo pessoa[] = new Sexo[5];
    
           for (int i = 0; i < 5; i ++) {
                String nome = Prompt.lerLinha("Nome: ");
                char sexo = Prompt.lerCaractere("Sexo[M / F]: ");
                pessoa[i] = new Sexo(nome, sexo);
            
                if (sexo == 'M') {
                    H ++;
                } else if (sexo == 'F') {
                    M ++;
                }
             }
    
             pessoa[0].setfemNum(H);
             pessoa[0].setmascNum(M);
    
             
             Prompt.imprimir("Total homens: " + pessoa[0].getmascNum());
            Prompt.imprimir("Total mulheres: " + pessoa[0].getfemNum());
    }
}


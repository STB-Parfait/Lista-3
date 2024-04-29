package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Aluno;
import lista.br.edu.up.util.Prompt;

public class Exercio8 {
    public static void executar() {
        /*8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. 
        Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) 
        e Recuperação (media entre 5.1 a 6.9)*/
        
        double soma = 0;
        int flag;
        Aluno aluno1 = new Aluno(3);
        double[] notas = new double[3];

        aluno1.setNome();
        Prompt.separador();
        Prompt.imprimir("Lendo notas:");
        

        for(int i = 0; i < aluno1.getnProvas(); i++){
            do{

            notas[i] = Prompt.lerDecimal("Nota["+(i + 1)+"]:");
            
            flag = 0;

            if(notas[i] <= 10 && notas[i] >= 0){

            soma += notas[i];
            }else{
                System.out.println("nota inválida");
                flag++;
            }
            }while(flag == 1);
        }
        Prompt.separador();

        aluno1.setNotas(notas);

        Prompt.imprimir("Nome: " + aluno1.getNome());
        double mediaAritimetica = (soma)/3;

        Prompt.imprimir("Nota final: " + mediaAritimetica);

        if(mediaAritimetica >= 7){
            Prompt.imprimir("Aluno Aprovado");

        }else if(mediaAritimetica > 5 && mediaAritimetica < 7){
            Prompt.imprimir("Aluno em Recuperação");

        }else if(mediaAritimetica <= 5){
            Prompt.imprimir("Aluno Reprovado");
            
        }
    }
}


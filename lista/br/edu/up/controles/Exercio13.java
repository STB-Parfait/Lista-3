package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.RegistroMilitar;
import lista.br.edu.up.util.Prompt;

public class Exercio13 {
    public static void executar() {
        /*13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está 
        apta ou não para cumprir o serviço militar obrigatório. Informe os totais*/

        int cont = Prompt.lerInteiro("Numero de pessoas: ");
        
        RegistroMilitar pessoa1[] = new RegistroMilitar[cont];

        for (int i = 0; i < cont; i ++) {
            String nome = Prompt.lerLinha("Nome:");
            char sexo = Prompt.lerCaractere("Sexo [M / F]:");
            int idade= Prompt.lerInteiro("Idade:");
            char saude = Prompt.lerCaractere("Saúde [B=boa / R=ruim]:");
            pessoa1[i] = new RegistroMilitar(nome, sexo, idade, saude);
            pessoa1[i].calcularAptidao();
        }

        for (int i = 0; i < cont; i ++) {
            System.out.printf("------------\n");
            System.out.printf("Nome: %s\n", pessoa1[i].getNome());
            System.out.printf("Idade: %d\n", pessoa1[i].getIdade());
            System.out.printf("Sexo: %c\n", pessoa1[i].getSexo());
            System.out.printf("Saude: %c\n", pessoa1[i].getSaude());
            System.out.printf("Aptidao: %s\n", pessoa1[i].getAptidao());
        }

    }
}


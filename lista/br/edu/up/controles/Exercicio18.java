package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio18 {
    public static void executar() {
        /*Programa que calcula o abono recebido pelos funcionarios de uma empresa */

        Funcionario funcionario = new Funcionario();

        Prompt.imprimir("nome:");
        funcionario.setNome(Prompt.lerLinha());
        Prompt.imprimir("idade:");
        funcionario.setIdade(Prompt.lerInteiro());
        Prompt.imprimir("sexo:");
        funcionario.setSexo(Prompt.lerCaractere());
        Prompt.imprimir("salário:");
        funcionario.setSalario(Prompt.lerDecimal());

        switch (funcionario.getSexo()){
            case 'm':
            if(funcionario.getIdade()>=30){
                funcionario.setSalario(funcionario.getSalario()+100);
            }
            else{
                funcionario.setSalario(funcionario.getSalario()+50);
            }
            break;

            case 'f':
            if(funcionario.getIdade()>=30){
                funcionario.setSalario(funcionario.getSalario()+200);
            }
            else{
                funcionario.setSalario(funcionario.getSalario()+80);
            }
            break;
        }

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Ficha cadastral]");
        Prompt.imprimir("[Nome] " + funcionario.getNome());
        Prompt.imprimir("[Idade] " + funcionario.getIdade());
        Prompt.imprimir("[Sexo] " + funcionario.getSexo());
        Prompt.imprimir("[Salário líquido] " + funcionario.getSalario());
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}

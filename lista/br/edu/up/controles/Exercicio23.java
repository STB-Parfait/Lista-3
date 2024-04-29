package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio23 {
    public static void executar() {
        /*Programa que calcula o peso ideal de uma pessoa de acordo com idade e sexo */

        double ideal;

        Pessoa pessoa = new Pessoa();

        Prompt.imprimir("Nome:");
        pessoa.setNome(Prompt.lerLinha());
        Prompt.imprimir("Sexo (m/f):");
        pessoa.setSexo(Prompt.lerCaractere());
        Prompt.imprimir("Idade:");
        pessoa.setIdade(Prompt.lerInteiro());
        Prompt.imprimir("Altura (em metros):");
        pessoa.setAltura(Prompt.lerDecimal());

        ideal = pessoa.pesoIdeal(pessoa.getSexo(),pessoa.getAltura(),pessoa.getIdade());

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[" + pessoa.getNome() + "]");
        Prompt.imprimir("[Sexo] " + pessoa.getSexo());
        Prompt.imprimir("[Idade] " + pessoa.getIdade());
        Prompt.imprimir("[Altura] " + pessoa.getAltura() + "m");
        Prompt.imprimir("[Peso Ideal] " + ideal + "kg");
        Prompt.linhaEmBranco();
        Prompt.separador();
        
    }
}

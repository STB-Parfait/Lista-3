package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio21 {
    public static void executar() {
        /*Programa que classifica um nadador de acordo com a idade */

        Nadador nadador = new Nadador();

        Prompt.imprimir("Nome:");
        nadador.setNome(Prompt.lerLinha());
        Prompt.imprimir("Idade:");
        nadador.setIdade(Prompt.lerInteiro());

        nadador.setCategoria();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Nadador: " + nadador.getNome() + "]");
        Prompt.imprimir("[Idade] " + nadador.getIdade());
        Prompt.imprimir("[Categoria] " + nadador.getCategoria());
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}

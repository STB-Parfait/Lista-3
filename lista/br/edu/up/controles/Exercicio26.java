package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio26 {
    public static void executar() {
        /*Programa que calcula a categoria de cliente potencial para uma seguradora */

        Cliente cliente = new Cliente();

        Prompt.imprimir("Nome:");
        cliente.setNome(Prompt.lerLinha());
        Prompt.imprimir("Idade:");
        cliente.setIdade(Prompt.lerInteiro());
        Prompt.imprimir("Grupo de risco:");
        Prompt.imprimir("Baixo Médio Alto");
        cliente.setGrupo(Prompt.lerLinha());

        cliente.checkCat();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("[Nome] " + cliente.getNome());
        Prompt.imprimir("[Idade] " + cliente.getIdade());
        Prompt.imprimir("[Grupo de risco] " + cliente.getGrupo());
        Prompt.imprimir("[Categoria] " + cliente.getCat());
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}

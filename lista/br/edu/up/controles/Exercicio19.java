package lista.br.edu.up.controles;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.modelos.*;
public class Exercicio19 {
    public static void executar() {
        /*Programa que informa o tipo de um triângulo */

        Triangulo tri = new Triangulo();

        Prompt.imprimir("insira o lado 1");
        tri.setLadoA(Prompt.lerInteiro());
        Prompt.imprimir("insira o lado 2");
        tri.setLadoB(Prompt.lerInteiro());
        Prompt.imprimir("insira o lado 3");
        tri.setLadoC(Prompt.lerInteiro());
    
        //---

        tri.triCheck();
        tri.checkType();

    if(tri.isTriangulo() == true){

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("O triângulo apresentado é do tipo " + tri.getTipo());
        Prompt.linhaEmBranco();
        Prompt.separador();
   }
    else{
        Prompt.imprimir("Forma inválida");
    }

}
}

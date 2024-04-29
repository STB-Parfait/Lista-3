package lista.br.edu.up.modelos;
import lista.br.edu.up.util.Prompt;

public class Intervalo10a150 {

    private int contador;

    public  Intervalo10a150(int  cont) {
        this.contador = cont;
    }

    public Intervalo10a150() {
    }

    public int calcularContador() {
        int cont = 0;
        for (int i = 0; i < 80; i++){
            double num = Prompt.lerDecimal("Digite um número: ");
            if (num >= 10 && num <= 150) {
                cont++;
            }
        }

        return cont; 
    }

    public int getCont(){
        return contador;
    }

    public void setCont(int cont){
        this.contador = cont;
    }

}

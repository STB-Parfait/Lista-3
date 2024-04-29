package lista.br.edu.up.modelos;
import lista.br.edu.up.util.Prompt;
public class Professor {
    private int nivel;
    private int horas;
    private double salario;
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getSalario() {
        return salario;
    }

    public void setSal(){
        switch(nivel){
            case 1:
            salario = (horas*12);
            break;

            case 2:
            salario = (horas*17);
            break;

            case 3:
            salario = (horas*25);
            break;

            default:
            Prompt.imprimir("Nível Inválido!");
            break;
        }
    }
    
}

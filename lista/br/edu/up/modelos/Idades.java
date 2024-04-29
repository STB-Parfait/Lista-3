package lista.br.edu.up.modelos;

public class Idades {
    
    private int numPessoas;
    private int[] idades;

    public Idades(int numPessoas){
        this.numPessoas = numPessoas;
        this.idades = new int[numPessoas];
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public int[] getIdades() {
        return idades;
    }

    public void setIdades(int[] idades) {
        this.idades = idades;
    }
}


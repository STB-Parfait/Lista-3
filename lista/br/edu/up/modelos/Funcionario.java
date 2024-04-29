package lista.br.edu.up.modelos;

public class Funcionario {
    private String nome;
    private int idade;
    private char sexo;

    private double salario, nsalario, numsal, med;
    private double min = 1400.12;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getNsalario() {
        return nsalario;
    }

    public void setNsalario(double nsalario) {
        this.nsalario = nsalario;
    }

    public String getNome() {
        return nome;
    }

    public double getMed() {
        return med;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcMed() {
        numsal = salario / min;

        if (numsal > 10 && numsal <= 20) {
            nsalario = (salario + (salario * 0.15));
        } else if (numsal > 3 && numsal <= 10) {
            nsalario = (salario + (salario * 0.20));
        } else if (numsal < 3) {
            nsalario = (salario + (salario * 0.50));
        } else {
            nsalario = (salario + (salario * 0.10));
        }

        med = (nsalario - salario) / salario;
    }

}

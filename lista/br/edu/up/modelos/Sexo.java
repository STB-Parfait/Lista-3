package lista.br.edu.up.modelos;

public class Sexo {
    private String nome;
    private char sexo;
    private int mascNum;
    private int femNum;

    public Sexo(int mascNum, int femNum) {
        this.mascNum = mascNum;
        this.femNum = femNum;

    }

    public Sexo(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setmascNum(int mascNum) {
        this.mascNum = mascNum;
    }

    public void setfemNum(int femNum) {
        this.femNum = femNum;
    }

    public int getfemNum() {
        return femNum;
    }
    public int getmascNum() {
        return mascNum;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void calcularSexoNum() {
        if (this.sexo == 'M') {
            this.mascNum ++;
        } else if (this.sexo == 'F') {
            this.femNum ++;
        }
    }
}
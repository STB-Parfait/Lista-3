package lista.br.edu.up.modelos;
import lista.br.edu.up.util.Prompt;

public class Aluno {

    private String nome;
    private int nProvas;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    private double[] notas;
    private int[] pesos;
    private double notaFinal;
    private char classificacao;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public void calcularmedia() {
        this.media = (this.nota1 + this.nota2 + this.nota3);
    }
    public void mediaPonderada(double a, double b, double c){
        this.media = ((this.nota1*2)+(this.nota2*3)+(this.nota3*5))/(2+3+5);
    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Aluno(int nProvas) {
        this.nProvas = nProvas;
        notas = new double[nProvas];
        pesos = new int[nProvas];
    }

    public void setNome(){
        this.nome = Prompt.lerLinha("Nome do aluno");
    }

    public void setClassificacao(double nota) {
        char classif = ' ';

        if(nota <= 10 && nota >= 8){
            classif = 'A';
        }
        else if(nota < 8 && nota >= 7){
            classif = 'B';
        }
        else if(nota < 7 && nota >= 6){
            classif = 'C';
        }
        else if(nota < 6 && nota >= 5){
            classif = 'D';
        }
        else if(nota < 5){
            classif = 'R';
        }
        this.classificacao = classif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnProvas() {
        return nProvas;
    }

    public void setnProvas(int nProvas) {
        this.nProvas = nProvas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int [] getPesos() {
        return pesos;
    }

    public void setPesos(int[] pesos) {
        this.pesos = pesos;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void calularNotaFinal() {
        this.notaFinal =  ((this.notas[0] * this.pesos[0]) + (this.notas[1] * this.pesos[1]) + (this.notas[2] * this.pesos[2]))/(this.pesos[0] + this.pesos[1] + this.pesos[2]);
    }

    public char getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}

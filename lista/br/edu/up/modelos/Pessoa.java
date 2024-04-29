package lista.br.edu.up.modelos;
public class Pessoa {
    
    private String nome;
    private char sexo;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double pesoIdeal(char sexo, double altura, int idade){
        double peso=0;
        switch(sexo){
            case 'm':
            if(altura>170){
                if(idade<=20){
                    peso = (72.7*altura)-58;
                }
                else if(idade>=21&&idade<=39){
                    peso = (72.7*altura)-53;
                }
                else{
                    peso = (72.7*altura)-45;
                }
            }
            else{
                if(idade<=40){
                    peso = (72.7*altura)-50;
                }
                else{
                    peso = (72.7*altura)-58;
                }
            }
            case 'f':
            if(altura>150){
                peso = (62.1*altura)-44.7;
            }
            else{
                if(idade>=35){
                    peso = (62.1*altura)-45;
                }
                else{
                    peso = (62.1*altura)-49;
                }
            }
        }
        //fim dos condicionais
        return peso;
    }

}

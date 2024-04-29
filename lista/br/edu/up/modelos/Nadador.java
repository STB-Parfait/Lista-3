package lista.br.edu.up.modelos;
import lista.br.edu.up.util.Prompt;
public class Nadador {
    
    private String nome;
    private int idade;
    private String categoria;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(){
        
        if(idade>=5&& idade<=7){
            categoria = "infantil A";
        }
        else if(idade>=8&&idade<=10){
            categoria = "infantil B";
        }
        else if(idade>=11&&idade<=13){
            categoria = "juvenil A";
        }
        else if(idade>=14&&idade<=17){
            categoria = "juvenil B";
        }
        else if(idade>=18&&idade<=25){
            categoria = "senior";
        }
        else{
            Prompt.imprimir("idade fora da faixa etária");
        }
        
    }
}

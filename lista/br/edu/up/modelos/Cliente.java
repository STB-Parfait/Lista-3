package lista.br.edu.up.modelos;
import lista.br.edu.up.util.Prompt;
public class Cliente {
    private String nome;
    private int idade,cat;
    private String grupo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void checkCat(){
        switch(grupo){
            case "baixo":
            if(idade>=17&&idade<=20){
                cat=1;
            }
            else if(idade>=21&&idade<=24){
                cat=2;
            }
            else if(idade>=25&&idade<=34){
                cat=3;
            }
            else if(idade>=35&&idade<=64){
                cat=4;
            }
            else if(idade>=65&&idade<=70){
                cat=7;
            }
            else{
                Prompt.imprimir("Nenhum plano disponível");
            }
            break;

            case "medio":
            if(idade>=17&&idade<=20){
                cat=2;
            }
            else if(idade>=21&&idade<=24){
                cat=3;
            }
            else if(idade>=25&&idade<=34){
                cat=4;
            }
            else if(idade>=35&&idade<=64){
                cat=5;
            }
            else if(idade>=65&&idade<=70){
                cat=8;
            }
            else{
                Prompt.imprimir("Nenhum plano disponível");
            }
            break;

            case "alto":
            if(idade>=17&&idade<=20){
                cat=3;
            }
            else if(idade>=21&&idade<=24){
                cat=4;
            }
            else if(idade>=25&&idade<=34){
                cat=5;
            }
            else if(idade>=35&&idade<=64){
                cat=6;
            }
            else if(idade>=65&&idade<=70){
                cat=9;
            }
            else{
                Prompt.imprimir("Nenhum plano disponível");
            }
            break;
        }
    }

    public int getCat() {
        return cat;
    }
}

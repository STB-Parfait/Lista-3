package lista.br.edu.up.modelos;

public class Dinheiro {
    private double valDolar;
    private double valReais;
    private double cotacao;

    public Dinheiro(double valDolar) {
        this.valDolar = valDolar;
    }


    public double getValDolar() {
        return valDolar;
    }


    public void setValDolar(double valDolar) {
        this.valDolar = valDolar;
    }


    public double getValReais() {
        return valReais;
    }
    

    public double getCotacao() {
        return cotacao;
    }


    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }


    public double calcularValReais(){
        return this.valReais = this.valDolar * this.cotacao;
    }

}


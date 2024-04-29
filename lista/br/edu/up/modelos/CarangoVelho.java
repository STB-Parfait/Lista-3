package lista.br.edu.up.modelos;

public class CarangoVelho {
    private double precoCarro;
    private double desconto;
    private double precoFinal;
    private int ano;
    
    public CarangoVelho(){

    }

    public CarangoVelho(double precoCarro, double desconto, int ano) {
        this.precoCarro = precoCarro;
        this.desconto = desconto;
        this.ano = ano;
    }

    public double getPrecoCarro() {
        return precoCarro;
    }

    public void setPrecoCarro(double precoCarro) {
        this.precoCarro = precoCarro;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void calcularPrecoFinal() {
        this.precoFinal = this.precoCarro - (this.precoCarro * this.desconto);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
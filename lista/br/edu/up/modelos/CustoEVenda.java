package lista.br.edu.up.modelos;

public class CustoEVenda {
    private double precoCusto;
    private double valorVenda;
    private double percAcrecimo;

    public CustoEVenda(){

    }
    public CustoEVenda(double precoCusto, double percAcrecimo) {
        this.precoCusto = precoCusto;
        this.percAcrecimo = percAcrecimo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public double getPercAcrecimo() {
        return percAcrecimo;
    }

    public void setPercAcrecimo(double percAcrecimo) {
        this.percAcrecimo = percAcrecimo;
    }

    public double calcularValorVenda(){
        return this.valorVenda =  this.precoCusto *(1 + (this.percAcrecimo / 100));
    }
}

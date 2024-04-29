package lista.br.edu.up.modelos;

public class PrestacaoMCA {
    private double valCompra;
    private double valPrestacao;

    public PrestacaoMCA(double total){
        this.valCompra = total;
    }

    public void calcularPrestacao() {
        this.valPrestacao = this.valCompra/5;
    }
    
    public double getValCompra() {
        return valCompra;
    }

    public void setValCompra(double valCompra) {
        this.valCompra = valCompra;
    }

    public double getValPrestacao() {
        return valPrestacao;
    }

    public void setValPrestacao(double valPrestacao) {
        this.valPrestacao = valPrestacao;
    }

    
}
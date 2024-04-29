package lista.br.edu.up.modelos;

public class CustoAoConsumidor {
    private double custoTotal;
    private double custoFabrica;
    private double porcDistribuidora = 0.28;
    private double porcImposto = 0.45;
    private double impostos;
    private double impostosDistribuidora;
    

    public CustoAoConsumidor(double custoFabrica) {
        this.custoFabrica = custoFabrica;

    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }


    public double getPorcDistribuidora() {
        return porcDistribuidora;
    }

    public void setPorcDistribuidora(double porcDistribuidora) {
        this.porcDistribuidora = porcDistribuidora;
    }

    public double getPorcImposto() {
        return porcImposto;
    }

    public void setPorcImposto(double porcImposto) {
        this.porcImposto = porcImposto;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getImpostosDistribuidora() {
        return impostosDistribuidora;
    }

    public void setImpostosDistribuidora(double impostosDistribuidora) {
        this.impostosDistribuidora = impostosDistribuidora;
    }

    public double calcularCustoTotal(){
        this.impostos = this.custoFabrica * this.porcImposto;

        this.impostosDistribuidora = (this.custoFabrica + this.impostos) * this.porcDistribuidora;

        return this.custoTotal = this.custoFabrica + this.impostos + impostosDistribuidora;  
    }
}


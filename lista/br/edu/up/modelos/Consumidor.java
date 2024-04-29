package lista.br.edu.up.modelos;
public class Consumidor {
    private String tipo;
    private int consumo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getConsumo() {
        return consumo;
    }
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double calcLuz(String tipo, int consumo){
        double total = 0;
        switch (tipo){
            case "industria":
            total = (consumo*16)*26;
            break;

            case "comercio":
            total = (consumo*16)*22;
            break;

            case "residencia":
            total = (consumo*12)*30;
            break;
        }
        return total;
    }
    
}

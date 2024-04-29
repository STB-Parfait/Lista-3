package lista.br.edu.up.modelos;

public class Triangulo {
    private int ladoA, ladoB, ladoC;
    private String tipo;
    private boolean triangulo;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public String getTipo() {
        return tipo;
    }

    public void triCheck() {
        if (ladoA + ladoB >= ladoC) {
            triangulo = true;
        } else if (ladoB + ladoC >= ladoC) {
            triangulo = true;
        } else if (ladoC + ladoA >= ladoB) {
            triangulo = true;
        }

        else {
            triangulo = false;
        }
    }

    public void checkType() {
        int eqs = 0;
        if (triangulo == true) {
            if (ladoA == ladoB) {
                eqs++;
            }
            if (ladoB == ladoC) {
                eqs++;
            }
            if (ladoC == ladoA) {
                eqs++;
            }
            switch (eqs) {

                case 3:
                    tipo = "equilatero";
                    break;

                case 1:
                    tipo = "isoceles";
                    break;

                case 0:
                    tipo = "escaleno";
                    break;

            }
        }

    }

    public boolean isTriangulo() {
        return triangulo;
    }
}

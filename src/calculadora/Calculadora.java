package calculadora;

public class Calculadora {

    private Double valor1;
    private Double valor2;

    public Calculadora() {
    }

    public Calculadora(Double valor1, Double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double adicionar() {
        return this.valor1 + this.valor2;
    }

    public double subtrair() {
        return this.valor1 - this.valor2;
    }

    public double multiplicar() {
        return this.valor1 * this.valor2;
    }

    public Double dividir() {
        if (this.valor2 == 0) {
            System.out.println("Impossível dividir por zero");
            return null;
        }
        return this.valor1 / this.valor2;
    }

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }
}

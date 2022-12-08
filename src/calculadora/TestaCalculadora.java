package calculadora;

public class TestaCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(7., 0.);

        System.out.println(calc.adicionar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());

    }
}

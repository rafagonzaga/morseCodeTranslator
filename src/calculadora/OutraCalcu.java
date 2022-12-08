package calculadora;

public class OutraCalcu {

    public static void main(String[] args) {
        boolean working = false;


        /*
        do {
            exibirMenu();
            option = input.nextInt();

            System.out.println("Você escolheu: " + option);
            if (option == 0) {
                System.out.println("Até a próxima!");
                break;
            } else if (option < 0 || option > 7) {
                System.out.println("Operação inválida. Tente novamente.\n");
                working = true;
                continue;
            }
            System.out.print("Digite o primeiro número: ");
            double num1 = input.nextDouble();
            double num2;
            if (option == 4) {
                do {
                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Impossível dividir por zero. Tente novamente.");
                    }
                } while (num2 == 0);

            } else {
                System.out.print("Digite o segundo número: ");
                num2 = input.nextDouble();
            }

            double resultado;

            String operation;

            switch (option) {
                case 1: {
                    operation = "+";
                    resultado = adicionar(num1, num2);
                    break;
                }
                case 2: {
                    operation = "-";
                    resultado = subtrair(num1, num2);
                    break;
                }
                case 3: {
                    operation = "*";
                    resultado = multiplicar(num1, num2);
                    break;
                }
                case 4: {
                    operation = "/";
                    resultado = dividir(num1, num2);
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + option);
            }

            System.out.printf("O resultado de %.2f %s %.2f é igual a %.2f", num1, operation, num2, resultado);

        } while (working);
        */
    }
}

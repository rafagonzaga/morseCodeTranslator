package parImpar;

import java.util.Scanner;

public class TesteParidade {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Verificar a paridade de: ");
        long numero = entrada.nextLong();
        entrada.close();

        VerificaParidade teste = new VerificaParidade(numero);
        System.out.println(teste.verificarParidade());

    }
}

package desafioCodigoMorse;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a mensagem: ");
        String message = entrada.nextLine();

        Portuguese pt = new Portuguese();
        Morse mo = new Morse();

        String ajudaJoao = ".--- --- .- --- / -.-. --- -. - .- / -.-. --- -- / .- / ... ..- .- / .- .--- ..- -.. .-";

        String texto = pt.convertToMorse(message);
        System.out.println(texto);

        ajudaJoao = mo.convertToPortugues(ajudaJoao);
        System.out.println("\nMensagem codificada do João");
        System.out.println(ajudaJoao);

        entrada.close();
    }
}
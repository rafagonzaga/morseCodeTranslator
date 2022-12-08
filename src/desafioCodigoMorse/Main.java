package desafioCodigoMorse;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a mensagem: ");
        String message = entrada.nextLine();
//        String message = "Boa Sorte";
        Portuguese pt = new Portuguese();
        Morse mo = new Morse();
//        String codificada = "-... --- .- / ... --- .-. - . ";
        String codificada = ".--- --- .- --- / -.-. --- -. - .- / -.-. --- -- / .- / ... ..- .- / .- .--- ..- -.. .-";

        String texto = pt.convertToMorse(message);
        System.out.println(texto);
        texto = mo.convertToPortugues(texto);
        System.out.println(texto);
        entrada.close();
    }
}
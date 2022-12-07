import com.grupo02.Morse;
import com.grupo02.Portugues;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        String message = "1234567890";
        Portugues pt = new Portugues();
        Morse mo = new Morse();
//        String codificada = "-... --- .- / ... --- .-. - . ";
        String codificada = ".--- --- .- --- / -.-. --- -. - .- / -.-. --- -- / .- / ... ..- .- / .- .--- ..- -.. .-";

        String texto = pt.convertToMorse(message);
        System.out.println(texto);
        texto = mo.convertToPortugues(texto);
        System.out.println(texto);
    }
}
package com.grupo02;

import java.util.HashMap;
import java.util.Map;

public class Morse {

    private Map<String, String> map = new HashMap<>();

    public Morse() {
        initiateDict();
    }

    public void initiateDict() {
        this.map.put(".-", "A");
        this.map.put("-...", "B");
        this.map.put("-.-.", "C");
        this.map.put("-..", "D");
        this.map.put(".", "E");
        this.map.put("..-.", "F");
        this.map.put("--.", "G");
        this.map.put("....", "H");
        this.map.put("..", "I");
        this.map.put(".---", "J");
        this.map.put("-.-", "K");
        this.map.put(".-..", "L");
        this.map.put("--", "M");
        this.map.put("-.", "N");
        this.map.put("---", "O");
        this.map.put(".--.", "P");
        this.map.put("--.-", "Q");
        this.map.put(".-.", "R");
        this.map.put("...", "S");
        this.map.put("-", "T");
        this.map.put("..-", "U");
        this.map.put("...-", "V");
        this.map.put(".--", "W");
        this.map.put("-..-", "X");
        this.map.put("-.--", "Y");
        this.map.put("--..", "Z");
        this.map.put(".----", "1");
        this.map.put("..---", "2");
        this.map.put("...--", "3");
        this.map.put("....-", "4");
        this.map.put(".....", "5");
        this.map.put("-....", "6");
        this.map.put("--...", "7");
        this.map.put("---..", "8");
        this.map.put("----.", "9");
        this.map.put("-----", "0");
    }

    public String convertToPortugues(String message) {
        String[] words = message.split("/");
        String resultado = "";
        for (String s : words) {
            String[] word = s.split(" ");
            for (String value : word) {
                if(value == "") {
                    continue;
                }
                resultado += map.get(value);
            }
            resultado += " ";
        }
        return resultado;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    ;


}

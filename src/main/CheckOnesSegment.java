package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String abc = "abcdefghijklonmpqrstuvwxyz";
        licensePlate = licensePlate.toLowerCase(Locale.ROOT);
        ArrayList<Character> sbPlate = new ArrayList<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            int indInString = abc.indexOf(licensePlate.charAt(i));
            if (indInString >= 0) sbPlate.add(licensePlate.charAt(i));
        }
        Collections.sort(sbPlate);
        String wordToReturn = "";
        for (String word : words) {
            
        }

        return wordToReturn;
    }
}

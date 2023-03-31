package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text you would like evaluated: ");
        String sampleString = input.nextLine();
        String lowerCaseSampleString = sampleString.toLowerCase();
        char[] strChars = lowerCaseSampleString.toCharArray();
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for (char letter : strChars) {
            if (Character.isLetter(letter)) {
                if (!letterCounts.containsKey(letter)) {
                    letterCounts.put(letter, 1);
                } else {
                    letterCounts.put(letter, letterCounts.get(letter) + 1);
                }
            }

        }
        System.out.println(letterCounts);

    }
}

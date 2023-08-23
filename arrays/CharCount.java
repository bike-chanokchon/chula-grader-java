package arrays;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1321/04_Array_28.pdf
public class CharCount {
    public static void main(String[] args) {
        int[] characterCounts = new int[26];
        for (int i = 0; i < 26; i++) {
            characterCounts[i] = 0;
        }

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int characterIndex = (int) ch - 97;
                characterCounts[characterIndex]++;
            }
        }

        for (int i = 0; i < characterCounts.length; i++) {
            if (characterCounts[i] > 0) {
                char character = (char) (i + 97);
                System.out.println(character + " -> " + characterCounts[i]);
            }
        }
    }
}

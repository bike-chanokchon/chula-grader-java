package arrays;

import java.util.Scanner;

public class CutNShuffle {
    public static void main(String[] args) {
        int numberOfCards = 0;
        String[] cards = new  String[numberOfCards];
        String cardTexts;
        String steps;

        Scanner sc = new Scanner(System.in);
        numberOfCards = Integer.parseInt(sc.nextLine());
        cardTexts = sc.nextLine();
        steps = sc.nextLine();
        sc.close();

        System.out.println(cardTexts);
        System.out.println(steps);
    }
}

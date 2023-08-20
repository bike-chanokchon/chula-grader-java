package arrays;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1312/04_Array_22.pdf
public class CutNShuffle {
    public static void main(String[] args) {
        int numberOfCards = 0;
        String cardTexts;
        String steps;

        Scanner sc = new Scanner(System.in);
        numberOfCards = Integer.parseInt(sc.nextLine());
        cardTexts = sc.nextLine();
        steps = sc.nextLine();
        sc.close();

        String[] cards = new String[numberOfCards];
        int cardIndex = 0;

        String card = "";
        for (int j = 0; j < cardTexts.length(); j++) {
            if (cardTexts.charAt(j) == ' ') {
                cards[cardIndex] = card;
                card = "";
                cardIndex++;
            } else {
                card += Character.toString(cardTexts.charAt(j));
            }
        }

        if (!card.equals("")) {
            cards[cardIndex] = card;
            card = "";
        }

        for (int stepIndex = 0; stepIndex < steps.length(); stepIndex++) {
            char step = steps.charAt(stepIndex);
            if (step == ' ')
                continue;

            if (step == 'C') {
                int median = numberOfCards / 2;
                String[] newCards = new String[numberOfCards];

                int firstHalfIndex = 0;
                int secondHalfIndex = median;

                for (int i = 0; i < median; i++) {
                    newCards[i] = cards[secondHalfIndex];
                    newCards[secondHalfIndex] = cards[firstHalfIndex];

                    firstHalfIndex++;
                    secondHalfIndex++;
                }

                cards = newCards;
            } else if (step == 'S') {
                int median = numberOfCards / 2;
                String[] newCards = new String[numberOfCards];

                int firstHalfIndex = 0;
                int secondHalfIndex = median;

                for (int i = 0; i < numberOfCards; i += 2) {  
                    newCards[i] = cards[firstHalfIndex];
                    newCards[i + 1] = cards[secondHalfIndex];

                    firstHalfIndex++;
                    secondHalfIndex++;
                }

                cards = newCards;
            } else {
                continue;
            }
        }

        System.out.println("---------");
        for (String c : cards) {
            System.out.print(c + " ");
        }
    }
}

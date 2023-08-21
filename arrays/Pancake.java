package arrays;

import java.util.Scanner;

public class Pancake {
    public static void main(String[] args) {
        int count = 0;
        String numberTexts = "";

        Scanner sc = new Scanner(System.in);
        count = Integer.parseInt(sc.nextLine());
        numberTexts = sc.nextLine();
        sc.close();

        // splite to array int
        int[] numbers = new int[count];
        int numberIndex = 0;
        for (int i = 0; i < numberTexts.length(); i++) {
            char ch = numberTexts.charAt(i);
            if (ch == ' ')
                continue;

            numbers[numberIndex] = (int) ch - '0';
            numberIndex++;
        }

        for (int i = 0; i < count; i++) {
            int max = numbers[0];
            int maxIndex = 0;
            for (int mi = 0; mi < count - i; mi++) {
                if (numbers[mi] > max) {
                    max = numbers[mi];
                    maxIndex = mi;
                }
            }

            int[] flipTemps = new int[count];
            int flipTempIndex = 0;
            for (int ni = maxIndex; ni >= i; ni--) {
                flipTemps[flipTempIndex] = numbers[ni];
                flipTempIndex++;
            }

            for (int ni = 0; ni < flipTempIndex; ni++) {
                numbers[ni] = flipTemps[ni];
            }

            int[] flipAllTemps = new int[count];
            int flipAllTempIndex = 0;
            for (int ni = count - 1; ni >= 0; ni--) {
                flipAllTemps[flipAllTempIndex] = numbers[ni];
                flipAllTempIndex++;
            }
            numbers = flipAllTemps;

            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

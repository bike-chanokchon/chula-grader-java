package arrays;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1310/04_Array_13.pdf
public class Peaks {
    public static void main(String[] args) {
        int round = 0;
        String input;
        Scanner sc = new Scanner(System.in);
        round = Integer.parseInt(sc.nextLine());
        input = sc.nextLine();
        sc.close();

        int[] y = new int[round]; 
        int yIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') continue;
            y[yIndex] = input.charAt(i) - '0';
            yIndex++;
        }

        int before = 0;
        int after = 0;
        int current = 0;
        int peakCount = 0;
        for (int i = 0; i < y.length; i++) {
            if (i == 0) {
                current = y[i];
                after = y[i + 1];
            } else if (i == y.length - 1) {
                before = y[i - 1];
                current = y[i];
                after = y[i];
            } else {
                before = y[i - 1];
                current = y[i];
                after = y[i + 1];
            }

            if (current > before && current > after) {
                peakCount++;
            }
        }

        System.out.print(peakCount);
    }
}

package arrays;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1309/04_Array_12.pdf
public class NickName {
    public static void main(String[] args) {
        String[] firstNames = {
                "Robert",
                "William",
                "James",
                "John",
                "Margaret",
                "Edward",
                "Sarah",
                "Andrew",
                "Anthony",
                "Deborah"
        };

        String[] nickNames = {
                "Dick",
                "Bill",
                "Jim",
                "Jack",
                "Peggy",
                "Ed",
                "Sally",
                "Andy",
                "Tony",
                "Debbie"
        };

        int round = 0;

        Scanner sc = new Scanner(System.in);
        round = Integer.parseInt(sc.nextLine());

        String[] results = new String[round];

        for (int j = 0; j < round; j++) {
            String input = sc.nextLine();

            for (int i = 0; i < 10; i++) {
                if (nickNames[i].equals(input)) {
                    results[j] = firstNames[i];
                    break;
                }

                if (firstNames[i].equals(input)) {
                    results[j] = nickNames[i];
                    break;
                }

                results[j] = "Not found";
            }
        }

        sc.close();

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
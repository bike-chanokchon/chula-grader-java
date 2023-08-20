package arrays;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1313/04_Array_23.pdf
public class LandingFee {
    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        count = Integer.parseInt(sc.nextLine());

        String[] countries = new String[count];
        int[] fees = new int[count];

        for (int i = 0; i < count; i++) {
            String countryWithFee = sc.nextLine();

            int step = 1;
            String country = "";
            String fee = "";
            for (int j = 0; j < countryWithFee.length(); j++) {
                if (countryWithFee.charAt(j) == ' ') {
                    step++;
                    continue;
                }
                ;

                if (step == 1) {
                    country += Character.toString(countryWithFee.charAt(j));
                } else {
                    fee += Character.toString(countryWithFee.charAt(j));
                }
            }

            countries[i] = country;
            fees[i] = Integer.parseInt(fee);
        }

        String travelSteps = sc.nextLine();
        sc.close();

        String travelStep = "";
        int step = 1;
        int countryCount = 0;
        String previosCountry = "";
        String currentCountry = "";
        int total = 0;
        for (int i = 0; i < travelSteps.length(); i++) {
            if (travelSteps.charAt(i) == ' ')
                step++;

            if (step == 1) {
                travelStep += travelSteps.charAt(i);
            } else {
                currentCountry = Character.toString(travelStep.charAt(travelStep.length() - 2))
                        + Character.toString(travelStep.charAt(travelStep.length() - 1));
                if (countryCount > 0 && !currentCountry.equals(previosCountry)) {
                    int countryIndex = 0;
                    for (int j = 0; j < countries.length; j++) {
                        if (countries[j].equals(currentCountry)) {
                            countryIndex = j;
                            break;
                        }
                    }

                    total += fees[countryIndex];
                }

                countryCount++;
                previosCountry = currentCountry;
                currentCountry = "";
                travelStep = "";
                step = 1;
            }
        }

        currentCountry = Character.toString(travelStep.charAt(travelStep.length() - 2))
                + Character.toString(travelStep.charAt(travelStep.length() - 1));
        if (!travelStep.equals("") && !previosCountry.equals(currentCountry)) {
            int countryIndex = 0;
            for (int j = 0; j < countries.length; j++) {
                if (countries[j].equals(currentCountry)) {
                    countryIndex = j;
                    break;
                }
            }

            total += fees[countryIndex];
        }

        System.out.println(total);
    }
}

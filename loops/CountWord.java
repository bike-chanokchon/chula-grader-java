package loops;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1296/03_Loop_13.pdf
public class CountWord {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String interestWord = sc.nextLine();
		String sentense = sc.nextLine();

		int totalWords = 0;
		int interestWordIndex = 0;

		for (int i = 0; i < sentense.length(); i++) {
			char ch = sentense.charAt(i);

			boolean matchLowerCharacter = ((int) ch >= (int) 'a' && (int) ch <= (int) 'z');
			boolean matchUppperCharacter = ((int) ch >= (int) 'A' && (int) ch <= (int) 'Z');
			if (matchLowerCharacter || matchUppperCharacter) {
				if (sentense.charAt(i) == interestWord.charAt(interestWordIndex)) {
					interestWordIndex++;

					if (interestWordIndex == interestWord.length() - 1) {
						totalWords++;
						interestWordIndex = 0;
					}
				} else {
					interestWordIndex = 0;
				}
			}
		}

		System.out.println(totalWords);

		sc.close();
	}
}

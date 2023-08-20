package arrays;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1308/04_Array_11.pdf
public class MissingDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texts = sc.nextLine();
		sc.close();

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] results = new int[10];
		int resultIndex = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			boolean isMissing = true;
			
			for (int j = 0; j < texts.length(); j++) {
				if (texts.charAt(j) < '0' || texts.charAt(j) > '9') {
					isMissing = false;
					break;
				}
				
				int number = (int) texts.charAt(j) - '0';
				if (numbers[i] == number) {
					isMissing = false;
					break;
				};
			}
			
			if (isMissing) {
				results[resultIndex] = numbers[i];
				resultIndex++;
			}
		}
		
		if (resultIndex == 0) {
			System.out.println("None");
		} else {
			for (int i = 0; i < resultIndex; i++) {
				
				if (i != resultIndex - 1) {
					System.out.print(results[i] + ",");
				} else {
					System.out.print(results[i]);
				}
				
			}
		}
	}

}

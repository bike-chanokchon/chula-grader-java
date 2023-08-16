package loops;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1303/03_Loop_24.pdf
public class RLE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texts = sc.nextLine();
		sc.close();

		int jumpIndex = 0;
		for (int i = 0; i < texts.length(); i++) {
			char current = texts.charAt(i);
			int duplicateCount = 0;
			
			for (int j = i; j < texts.length(); j++) {
				char next = texts.charAt(j);

				// skip if j index + 1 is end of length
				if (j + 1 == texts.length()) {
					jumpIndex = j;
				}
				
				if (current == next) {
					duplicateCount++;
				} else {
					if (j < texts.length()) {
						jumpIndex = j - 1;				
					}
					break;
				}
			}
			
			if (jumpIndex > 0) {
				i = jumpIndex;
				jumpIndex = 0;
			}
			
			System.out.print(current);
			System.out.print(duplicateCount + " ");
		}
	}
}

package loops;

import java.util.Scanner;

public class RemoveLongDups {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		int k = sc.nextInt();
		sc.close();
		
		int jumpIndex = 0;
		for (int i = 0; i < t.length(); i++) {
			char current = t.charAt(i);
			
			int duplicateCount = 0;
			for (int j = i + 1; j < t.length(); j++) {
				char next = t.charAt(j);
				
				if (current == next) {
					duplicateCount++;
				} else {
					if (duplicateCount + 1 >= k) {
						jumpIndex = j;
					}
					
					break;
				}
			}
			
			if (jumpIndex > 0) {
				i = jumpIndex - 1;
				jumpIndex = 0;
			} else {
				System.out.print(current);
			}
			
		}
	}
}

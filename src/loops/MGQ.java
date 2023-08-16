package loops;

import java.util.Scanner;

public class MGQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		String input = sc.nextLine();
		
		if (answer.length() != input.length()) {
			System.out.println("Incomplete answer");
		} else {
			int totalCount = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == answer.charAt(i)) {
					totalCount++;
				}
			}
			System.out.println(totalCount);
		}
		
		sc.close();
	}
}

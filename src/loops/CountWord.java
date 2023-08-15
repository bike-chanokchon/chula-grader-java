package loops;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1296/03_Loop_13.pdf
public class CountWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String interestWord = sc.nextLine();
		String sentense = sc.nextLine();
		
		for (int i = 0; i < sentense.length(); i++) {
			char ch = sentense.charAt(i);
			System.out.println((int) ch);
		}
		
		sc.close();
	}
}

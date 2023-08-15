package loops;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// https://2110104.nattee.net/tasks/download/1294/03_Loop_11.pdf
		Scanner sc = new Scanner(System.in);
		
		double input = 0.0d;
		double value = 0.0d;
		double divide = 0.0d;
		
		while (true) {
			input = sc.nextDouble();
			
			if (input != -1) {
				System.out.println(input);
				value += input;
				divide++;
			} else if (input == -1 && value == 0.0d ) {
				System.out.println("No Data");
			} else {
				break;
			}
		}
		
		double avg = value / divide;
		System.out.println((Math.ceil(avg * 100.0d) / 100.0d));
		sc.close();
	}
}

package loops;

import java.util.Scanner;

// https://2110104.nattee.net/tasks/download/1301/03_Loop_22.pdf
public class Factorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int k = 2;
		String result = "";
		while (n > 1) {
			if (n % k == 0) {
				result += ((n / k) > 1) ? k + "*" : k;
				n = n / k;
			} else {
				k++;
			}
		}
		
		System.out.println(result);
	}
}

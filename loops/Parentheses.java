package loops;

import java.util.Scanner;

public class Parentheses {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch (ch) {
			case '(':
				result += '[';
				break;
			case '[':
				result += '(';
				break;
			case ')':
				result += ']';
				break;
			case ']':
				result += ')';
				break;
			default:
				result += input.charAt(i);
			}
		}
		sc.close();
		
		System.out.println(result);
	}
}

package loops;

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		sc.close();
		
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasNumber = false;
		boolean hasSpecialCharacter = false;
		
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			
			boolean upperCaseCondition = (int) ch >= 'A' && (int) ch <= 'Z';
			if (upperCaseCondition) {
				hasUpperCase = true;
				continue;
			}
			
			boolean lowerCaseCondition = (int) ch >= 'a' && (int) ch <= 'z';
			if (lowerCaseCondition) {
				hasLowerCase = true;
				continue;
			}
			
			boolean numberCondition = ((int) ch - '0') >= 0 && ((int) ch - '0') <= 9;
			if (numberCondition) {
				hasNumber = true;
				continue;
			}
			
			hasSpecialCharacter = true;
		}
		
		boolean strongPasswordCondition = (password.length() >= 12 && 
				hasUpperCase && 
				hasLowerCase && 
				hasSpecialCharacter);
		
		boolean weakPasswordCondition = (
				password.length() >= 8 && 
				hasUpperCase &&
				hasLowerCase &&
				hasNumber
				);
		if (strongPasswordCondition) {
			System.out.println("strong");
		} else if (weakPasswordCondition) {
			System.out.println("weak");
		} else {
			System.out.println("invalid");
		}
	}
}

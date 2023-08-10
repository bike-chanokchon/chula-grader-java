import java.util.Scanner;

public class GymnasticScore {
	public static void main(String[] args) {
		System.out.println("Hello from Gymnastic score.");
		
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		sc.close();
		
		String[] texts = input.split(" ");
		double min = Double.parseDouble(texts[0]);
		double max = Double.parseDouble(texts[1]);
		
		for (String text : texts) {
			double number = Double.parseDouble(text);
			
			if (number < min) min = number;
			
			if (number > max) max = number;
		}
		
		double total = 0.0d;
		for (String text : texts) {
			double number = Double.parseDouble(text);
			
			if (number != min && number != max) total += number;
		}
		
		System.out.println(Math.round((total / 2.0d) * 100) / 100.0d);
		
	}
}

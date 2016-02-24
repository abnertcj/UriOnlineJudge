package beginner._1009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Double salary, salesTotal;

		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		salary = Double.parseDouble(scanner.nextLine());
		salesTotal = Double.parseDouble(scanner.nextLine());
		salary += salesTotal * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f\n", salary);
		
		scanner.close();
	}
}

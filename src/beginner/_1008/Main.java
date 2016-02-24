package beginner._1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer employeeNumber, workedHoursNumber;
		Double amountPerMonth;
		
		Scanner scanner = new Scanner(System.in);
		employeeNumber = scanner.nextInt();
		workedHoursNumber = scanner.nextInt();
		amountPerMonth = Double.parseDouble(scanner.next());
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f\n", workedHoursNumber * amountPerMonth);
		
		scanner.close();
	}
	
}

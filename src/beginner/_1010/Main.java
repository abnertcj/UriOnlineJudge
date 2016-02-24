package beginner._1010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line1 = scanner.nextLine().split(" ");
		String[] line2 = scanner.nextLine().split(" ");
		
		Double result1 = Integer.parseInt(line1[1]) * Double.parseDouble(line1[2]);
		Double result2 = Integer.parseInt(line2[1]) * Double.parseDouble(line2[2]);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", result1 + result2);
		
		scanner.close();
	}
	
}

package beginner._1006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double A, B, C, weightA = 2.0, weightB = 3.0, weightC = 5.0, average;
		Scanner scanner = new Scanner(System.in);
		
		A = Double.parseDouble(scanner.nextLine());
		B = Double.parseDouble(scanner.nextLine());
		C = Double.parseDouble(scanner.nextLine());
		
		average = (A * weightA + B * weightB + C * weightC) / 10;
		
		System.out.printf("MEDIA = %.1f\n", average);
		
		scanner.close();
	}
	
}

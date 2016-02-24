package beginner._1005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double A, B, weightA = 3.5, weightB = 7.5, average;
		
		Scanner scanner = new Scanner(System.in);
		A = Double.parseDouble(scanner.nextLine());
		B = Double.parseDouble(scanner.nextLine());
		
		average = (A * weightA + B * weightB) / 11;
		
		System.out.printf("MEDIA = %.5f\n", average);
		
		scanner.close();
	}
}

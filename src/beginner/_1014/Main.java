package beginner._1014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer X;
		Double Y, result;
		Scanner scanner = new Scanner(System.in);
		X = scanner.nextInt();
		Y = scanner.nextDouble();
		result = X / Y;
		
		System.out.printf("%.3f km/l\n", result);
		
		scanner.close();
	}
	
}

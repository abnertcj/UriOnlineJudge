package beginner._1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer a, b, PROD;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		PROD = a * b;
		
		System.out.println("PROD = " + PROD);
		
		scanner.close();
	}
}

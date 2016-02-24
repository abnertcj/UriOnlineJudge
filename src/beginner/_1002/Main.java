package beginner._1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double pi = 3.14159, r, a;

		r = Double.parseDouble(scanner.nextLine());
		a = pi * Math.pow(r, 2);
		
		System.out.printf("A=%.4f\n", a);
		scanner.close();
	}
	
}
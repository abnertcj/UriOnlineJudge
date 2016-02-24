package beginner._1001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer a, b, x;

		a = Integer.parseInt(scanner.nextLine());
		b = Integer.parseInt(scanner.nextLine());
		x = a + b;
		
		System.out.println("X = " + x);
		scanner.close();
	}
	
}

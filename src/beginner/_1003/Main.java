package beginner._1003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer A, B, SOMA;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		scanner.close();
	}
}
package beginner._1007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer A, B, C, D, difference;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		difference = A * B - C * D;
		
		System.out.println("DIFERENCA = " + difference);
		
		scanner.close();
	}
	
}

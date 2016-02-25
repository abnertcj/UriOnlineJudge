package beginner._1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer R;
		Double pi = 3.14159, result;
		
		Scanner scanner = new Scanner(System.in);
		R = scanner.nextInt();
		
		result = (4.0 / 3.0) * pi * Math.pow(R, 3);
		
		System.out.printf("VOLUME = %.3f\n", result);
		
		scanner.close();
	}
	
}

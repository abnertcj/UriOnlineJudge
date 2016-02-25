package beginner._1012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double A = 0.0, B, C, pi = 3.14159;
		Scanner scanner = new Scanner(System.in);
		
		String[] line = scanner.nextLine().split(" ");
		A = Double.parseDouble(line[0]);
		B = Double.parseDouble(line[1]);
		C = Double.parseDouble(line[2]);
		
		System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
		System.out.printf("CIRCULO: %.3f\n", pi * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C) / 2);
		System.out.printf("QUADRADO: %.3f\n", B * B);
		System.out.printf("RETANGULO: %.3f\n", A * B);
		
		scanner.close();
	}
	
}

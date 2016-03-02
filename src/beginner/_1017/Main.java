package beginner._1017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer hours, averageSpeed;
		Double result;
		
		Scanner scanner = new Scanner(System.in);
		hours = scanner.nextInt();
		averageSpeed = scanner.nextInt();
		
		result = (averageSpeed * hours) / 12.0;
		
		System.out.printf("%.3f\n", result);
		
		scanner.close();
	}
	
}
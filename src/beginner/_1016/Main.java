package beginner._1016;

import java.util.Scanner;

/*
 * 1 km 		= 2 minutes
 * 30 km(input) = x
 */

public class Main {

	public static void main(String[] args) {
		Integer km, result;
		Scanner scanner = new Scanner(System.in);
		km = scanner.nextInt();
		
		result = (km * 2) / 1;
		
		System.out.println(result + " minutos");
		
		scanner.close();
	}
	
}

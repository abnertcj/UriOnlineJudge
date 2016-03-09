package beginner._1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer n, hours = 0, minutes = 0, seconds = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		if (n >= 60 * 60) {
			hours = n / (60 * 60);
			n = n % (60 * 60);
		}
		if (n >= 60) {
			minutes = n / 60;
			n = n % 60;
		}
			seconds = n;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		scanner.close();
	}
	
}

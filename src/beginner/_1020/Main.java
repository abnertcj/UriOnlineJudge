package beginner._1020._1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer n, year = 365, month = 30, day = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();

		if (n >= year) {
			System.out.println(n / year + " ano(s)");
			n = n % year;
		} else {
			System.out.println(0 + " ano(s)");
		}

		if (n >= month) {
			System.out.println(n / month + " mes(es)");
			n = n % month;
		} else {
			System.out.println(0 + " mes(es)");
		}

		if (n >= day) {
			System.out.println(n / day + " dia(s)");
		} else {
			System.out.println(0 + " dia(s)");
		}
		
		scanner.close();
	}
	
}

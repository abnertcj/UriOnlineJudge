package beginner._1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer[] notes = {100, 50, 20, 10, 5, 2, 1};
		Integer value, count = 0;
		
		Scanner scanner = new Scanner(System.in);
		value = scanner.nextInt();
		
		System.out.println(value);
		
		do {
			System.out.printf("%d nota(s) de R$ %d,00\n", value / notes[count], notes[count]);
			if (value >= notes[count])
				value -= notes[count] * (value / notes[count]);
		} while (notes[count ++] != 1);
		
		scanner.close();
	}
	
}

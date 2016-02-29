package beginner._1015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double x1, y1, x2, y2;
		Scanner scanner = new Scanner(System.in);
		String[] line1 = scanner.nextLine().split(" ");
		x1 = Double.parseDouble(line1[0]);
		y1 = Double.parseDouble(line1[1]);
		
		String[] line2 = scanner.nextLine().split(" ");
		x2 = Double.parseDouble(line2[0]);
		y2 = Double.parseDouble(line2[1]);
		
		System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		
		scanner.close();
	}
	
}

package beginner._1013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer a, b, c, result;
		Scanner scanner = new Scanner(System.in);
		
		String[] line = scanner.nextLine().split(" ");
		a = Integer.parseInt(line[0]);
		b = Integer.parseInt(line[1]);
		c = Integer.parseInt(line[2]);
		
		result = getGreatest(getGreatest(a, b), c);
		
		System.out.println(result + " eh o maior");
		
		scanner.close();
	}
	
	private static Integer getGreatest(Integer a, Integer b) {
		return (a + b + Math.abs(a - b)) / 2;
	}
	
}

package database;

import java.util.Scanner;

public class InputData {
	public static String inputString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public static int inputInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
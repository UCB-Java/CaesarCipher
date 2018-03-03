package br.com.ucb.util;

import java.util.Scanner;

public abstract class CaeserUtil {
	
	private static Scanner scanner;

	public static String readMessage() {
		scanner = new Scanner(System.in);
		
		String message = scanner.nextLine();
		
		return message;
	}

}

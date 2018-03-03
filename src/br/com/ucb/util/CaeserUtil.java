package br.com.ucb.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class CaeserUtil {
	
	private static Scanner scanner;

	public static String readMessage() {
		scanner = new Scanner(System.in);
		
		String message = scanner.nextLine();
		
		return message;
	}
	
	public static int readKey() {
		scanner = new Scanner(System.in);
		int key = 0;
		try {
			key = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Numero invalido para chave!");
		}
		
		return key;
	}

}

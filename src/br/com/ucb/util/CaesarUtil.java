package br.com.ucb.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class CaesarUtil {
	
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
			do {
				key = scanner.nextInt();
				if(key <= 0) {
					System.out.println("O valor da chave não pode ser 0 nem negativo! Digite novamente!");
				}
			} while(key <= 0);
		} catch(InputMismatchException e) {
			System.out.println("Numero invalido para chave!");
		}
		
		return key;
	}
	
	public static void printResults(String encryptedMsg, String decryptedMsg) {
		System.out.println("MENSAGEM CRIPTOGRAFADA:" + encryptedMsg);
		System.out.println("MENSAGEM NORMAL:" + decryptedMsg);
		
	}

}

package br.com.ucb.main;

import br.com.ucb.caesar.CaesarCipher;
import br.com.ucb.util.CaesarUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a mensagem que deseja: ");
		
		String message = CaesarUtil.readMessage();
		
		System.out.println("Entre com uma chave (INTEIRO)");
		int key = CaesarUtil.readKey();
		
		String encryptedMessage = CaesarCipher.encrypt(message, key);
		String decryptedMessage = CaesarCipher.decrypt(encryptedMessage, key);
		
		CaesarUtil.printResults(encryptedMessage, decryptedMessage);
		
	}

}

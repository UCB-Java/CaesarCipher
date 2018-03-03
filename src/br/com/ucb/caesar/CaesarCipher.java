package br.com.ucb.caesar;

public abstract class CaesarCipher {

	public static String encrypt(String message, int key) {
		String encryptedMessage = "";
		
		for(int i = 0 ; i < message.length() ; i++) {
			char c = (char) (message.charAt(i) + key);
			
			if(c < 'z') {
				encryptedMessage += (char) (message.charAt(i) + key);
			} else {
				encryptedMessage += (char) (message.charAt(i) - (26-key));
			}
		}
		
		return encryptedMessage;
	}
	
	
	public static String decrypt(String message, int key) {
		String decryptedMessage = "";
		
		for(int i = 0 ; i < message.length() ; i++) {
			char c = (char) (message.charAt(i) + key);
			
			if(c < 'z') {
				decryptedMessage += (char) (message.charAt(i) - key);
			} else {
				decryptedMessage += (char) (message.charAt(i) + (26-key));
			}
		}
		
		return decryptedMessage;
	}
}

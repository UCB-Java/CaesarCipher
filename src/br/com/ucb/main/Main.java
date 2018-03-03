package br.com.ucb.main;

import br.com.ucb.util.CaeserUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a mensagem que deseja: ");
		
		String message = CaeserUtil.readMessage();
	
		System.out.println(message);
		
		int key = CaeserUtil.readKey();
		
		System.out.println(key);
	}

}

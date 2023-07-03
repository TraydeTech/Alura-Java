package projetohellowork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// COMANDO DE SAIDA DE DADOS "ESCREVA"
		
		// ATALHO: sysout + Ctrl + Barra de espaço
		
		System.out.println("Hello Word !!!!");
		System.out.println("OK");
		
		
		
		
		//  COMANDO DE ENTRADA DE DASDOS "LEIA"
		
		try (Scanner leia = new Scanner(System.in)) {
			String nome = "";
			
			
			// CAPTURANDO DADOS NO CONSOLE
			
			
			System.out.println("Digite o seu nome");
			nome = leia.next();
			
			System.out.println("Olá, " + nome);
		}
		
		
		
		// DECLARAR VARIAAVEL NO "JAVA"

		
		
		
		
		
		
		
		
		
	}

}

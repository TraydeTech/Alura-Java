package projetohellowork;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		
		
		
		try (Scanner leia = new Scanner(System.in)) {
			Integer numero1 = 0;
			Integer numero2 = 0;
			 
			
			System.out.println("");
			System.out.println("");
			
			
			System.out.println("Digite o primeiro numero:");
			numero1 = leia.nextInt();
			
			System.out.println("Digite o segundo numero:");
			numero2 = leia.nextInt();
			
			Integer soma = numero1 + numero2;
			
			System.out.println(" A soma entre os números é: " + soma);
		}
		
		
		//System.out.println("Digite o segundo numero:");
		//Integer numero2 = leia.nextInt();
		
		

	}

}

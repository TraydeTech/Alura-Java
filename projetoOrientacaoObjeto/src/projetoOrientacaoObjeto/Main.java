package projetoOrientacaoObjeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// INSTANCIANDO UM OBJETO DA CLASSE CARRO
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Laranja");
		carro1.setModelo("HB 20");
		carro1.setAno(2022);
		
		
		System.out.println("**** Dados do Veículo ****");
		System.out.println("Cor: " + carro1.getCor() );
		System.out.println("Modelo: " + carro1.getModelo() );
		System.out.println("Ano: " + carro1.getAno());
		carro1.acelerar();
		
		
		
		
		System.out.println("-----------------------------\n");
		
		Carro carro2 = new Carro("Ferrari ", "Black ", 2022);
		
		System.out.println("**** Dados do Veículo 2 ****");
		System.out.println("Cor: " + carro2.getCor() );
		System.out.println("Modelo: " + carro2.getModelo() );
		System.out.println("Ano: " + carro2.getAno());
		carro2.acelerar();
		
		
		
		System.out.println("-----------------------------\n");
		
		
		Scanner leia = new Scanner(System.in);
		Carro carro3 = new Carro();
		
		
		
		System.out.println("Digite a cor do carro: ");
		carro3.setCor(leia.next());
		
		System.out.println("Digite o modelo do carro: ");
		carro3.setModelo(leia.next());
		
		System.out.println("Digite o Ano: ");
		carro3.setAno(leia.nextInt());
		
		
		System.out.println("-----------------------------\n");
		
		System.out.println("**** Dados do Veículo 3 ****");
		System.out.println("Cor: " + carro3.getCor() );
		System.out.println("Modelo: " + carro3.getModelo() );
		System.out.println("Ano: " + carro3.getAno());
		
		
		System.out.println("-----------------------------\n");
		
		
		
		
		

	}

}


public class TetoCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas = 4;
		

		if (idade >= 18) {

			System.out.println("Voce e maior de 18 anos,");
			System.out.println("Seja bem vindo");
			
		} else {
			
			if(quantidadePessoas >= 2) {
				System.out.println("Voce não tem  18 anos, mas pode entar" + "pois está acompanhado");
				
			} else {
				
				System.out.println("Infelizmente voce nao pode entrar");
			}
			
			}

	}

}

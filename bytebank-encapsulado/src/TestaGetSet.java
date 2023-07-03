
public class TestaGetSet {
	
	public static void main(String[] args) {
		
		Conta conta = new  Conta(1337, 24226);
		// conta.numero = 1337;
	
		System.out.println(conta.getNumero());
		
		Cliente jeff =new Cliente();
		jeff.setNome("Jefferson Trayde");
		conta.setTitular(jeff);
		
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular()); 
        System.out.println(jeff);
        System.out.println(conta.getTitular());
		
		;
		
	}

}

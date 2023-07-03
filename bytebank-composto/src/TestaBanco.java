

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente jeff = new Cliente();
		jeff.nome = "Jefferson Trayde";
		jeff.cpf = "222.222.222-22";
		jeff.profissao = "Programador";
		
		Conta contaDoJeff = new Conta();
		contaDoJeff.deposita(100);
		
		contaDoJeff.titular = jeff;
		System.out.println(contaDoJeff.titular.nome);
		System.out.println(contaDoJeff.titular);
		System.out.println(jeff);
	}

}

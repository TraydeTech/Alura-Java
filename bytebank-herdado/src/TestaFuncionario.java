

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario jeff = new Funcionario();
		jeff.setNome("Jeff Trayde");
		jeff.setCpf("976507499-91");
		jeff.setSalario(2600.00);
		
		
		System.out.println(jeff.getNome());
		System.out.println(jeff.getBonificacao());
		
		//jeff.salario = 300.0;
		
		
	}
	
}
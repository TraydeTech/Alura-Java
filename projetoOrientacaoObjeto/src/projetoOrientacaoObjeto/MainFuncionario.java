package projetoOrientacaoObjeto;

public class MainFuncionario {

	public static void main(String[] args) {
		
		
		// INSTANCIANDO UM OBJETO DA CLASSE CARRO
		
		
		Funcionario fun1 = new Funcionario();
		
		fun1.setNome("João da Silva ");
		fun1.setCpf("987.456.234.-09");
		fun1.setSalario(1400.00);

		System.out.println("**** Folha de Pagamento ****\n");
		System.out.println("None: " + fun1.getNome() );
		System.out.println("CPF: " + fun1.getCpf() );
		System.out.println("Salario R$: " + fun1.getSalario() );
		fun1.receberBonus(500.00);
		fun1.pagarPenalidade(0.00);
		fun1.mostrarSalario();
	
		System.out.println("-----------------------------\n");
		
		Funcionario fun2 = new Funcionario();
	
		fun2.setNome("Bob Esponja ");
		fun2.setCpf("987.222.111.-09");
		fun2.setSalario(1200.00);

		System.out.println("**** Folha de Pagamento ****\n");
		System.out.println("None: " + fun2.getNome() );
		System.out.println("CPF: " + fun2.getCpf() );
		System.out.println("Salario R$: " + fun2.getSalario() );
		fun2.receberBonus(1230.00);
		fun2.pagarPenalidade(230.00);
		fun2.mostrarSalario();
		
		System.out.println("-----------------------------\n");
		
	//	Funcionario fun2 = new Funcionario();
//	
//		fun3.setNome("Clak Quenti ");
//		fun3.setCpf("998.234.111.-09");
//		fun3.setSalario(3200.00);
//
//		System.out.println("**** Folha de Pagamento ****\n");
//		System.out.println("None: " + fun3.getNome() );
//		System.out.println("CPF: " + fun3.getCpf() );
//		System.out.println("Salario R$: " + fun3.getSalario() );
		
	
	
	}

}

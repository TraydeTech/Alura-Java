
// Gerente e um FuncionarioAutenticavel, Gerente herda da class  FuncionarioAutenticavel

public class Gerente extends Funcionario{

	
	public double getBonificacao() {
		System.out.println("Chamando Bonificacao do Gerente");
		return super.getSalario();
		
		
	}

}

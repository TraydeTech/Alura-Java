package projetoOrientacaoObjeto;

public class Funcionario {
	
	
	// DECLARACAO DE ATRIBUTOS
	
		private String nome;
		private String cpf;
		private Double salario;
		
		public Funcionario() {
			super();
		}
		
		public Funcionario(String nome, String cpf, Double salario) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.salario = salario;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public Double getSalario() {
			return salario;
		}
		
		public void setSalario(Double salario) {
			this.salario = salario;
		}
		
		// DECLARACAO DE METODOS PROPRIOS 
		
		public void receberBonus(Double valor) {
		this.salario = this.salario + valor;
		System.out.println(this.nome + " recebeu Bonus !!!");
					
		}
				
				// DECLARACAO DE METODOS PROPRIOS 
				
		public void pagarPenalidade(Double desconto) {
		this.salario = this.salario - desconto;
		System.out.println(this.nome + " Descontar a Penalidade !!!");
		
					
		}
				
				// DECLARACAO DE METODOS PROPRIOS 
				
		public void mostrarSalario() {
					
		System.out.println("O seu salario é de R$  " + this.salario);
					
		}
		
	
		
		
		
		
	
		
		

}

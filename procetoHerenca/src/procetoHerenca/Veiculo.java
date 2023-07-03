package procetoHerenca;

public class Veiculo {
	
	// DECLARACAO DE ATRIBUTOS
	
		private String modelo;
		private String cor;
		private boolean estado;
		public Veiculo() {
			super();
		}
		
		public Veiculo(String modelo, String cor, boolean estado) {
			super();
			this.modelo = modelo;
			this.cor = cor;
			this.estado = estado;
		}

		public String getModelo() {
			return modelo;
			
		}
		

		public void setModelo(String modelo) {
			this.modelo = modelo;
			
		}
		

		public String getCor() {
			return cor;
			
		}
		

		public void setCor(String cor) {
			this.cor = cor;
			
		}
		

		public boolean getEstado() {
			return estado;
			
		}
		

		public void setEstado(boolean estado) {
			this.estado = estado;
			
		}
		
		// DECLARACAO DE METODOS PROPRIOS 
		
		public void ascelecar() {
			System.out.println("ACELECROOOOOOOOOO !!!!");
			this.estado = true;
					
		}
		
		public void para() {
			System.out.println("PISSOU NO FREIOOOOOOOO");
			this.estado = false;
			
			
		}
		
		
		public void mostrarEstado() {
			
			if (this.estado == true) {
				System.out.println("O veiculos esta em movimento");
				
				
				
			} else {
				System.out.println("O veiculo esta parado");
				
				
				
			}
			
			//System.out.println("O veiculo esta em movimento? " + this.estado);
			
			
		}
		
		
		

}

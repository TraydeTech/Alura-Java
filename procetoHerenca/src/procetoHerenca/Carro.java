package procetoHerenca;

public class Carro extends Veiculo{
	
	
	private int ano;
	
	public Carro() {
		
		
	}
	
	public Carro(int ano) {
		this.ano = ano;
		
		
	}
	
	public int getAno() {
		return this.ano;
		
	}
	
	public void setAno() {
		
	}
	
	public void mostrarEstado() {
		
		if (this.getEstado()== true) {
			System.out.println("O " + this.getModelo() + "esta movimento");
			
			
			
		} else {
			System.out.println("O " + this.getModelo() + "parado");
			
			
			
		}
		
	}
	

}

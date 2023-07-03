package procetoHerenca;

public class Mai {

	public static void main(String[] args) {
		
	Veiculo veiculo = new Veiculo("Corrolla", "Roxo", true);
	
	
	veiculo.mostrarEstado();
	
	veiculo.para();
	veiculo.mostrarEstado();
	
	veiculo.ascelecar();
	veiculo.mostrarEstado();
	
	
	System.out.println("-----------------------------\n");
	
	
	Carro carro = new Carro();
	
	carro.setModelo("HB 20 ");
	
	carro.mostrarEstado();
	
	carro.ascelecar();
	carro.mostrarEstado();
	
	
	
	}
	
	
	
	
	
	
	

}

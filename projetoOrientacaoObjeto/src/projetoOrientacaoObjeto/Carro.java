package projetoOrientacaoObjeto;

public class Carro {

	// DECLARACAO DE ATRIBUTOS
	
	private String modelo;
	private String cor;
	private Integer ano;
	
	// DECLARACAO DO CONSTRUTOR VAZIO
	
	public Carro() {
		
	}
	
	// DECLARACAO DO CONSTRUTOR CHEIO
	
	public Carro(String modelo, String cor, Integer ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		
		
	}
	
	// DECLARARCAO DOS METODOS GET
	
	public String getModelo() { // ASSIMATIRA DO MEMETADO
		return this.modelo;
		
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public Integer getAno() {
		return this.ano;
		
				
	}
	
	// DECLARACAO DOS METODOS SET
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	// DECLARACAO DE METODOS PROPRIOS 
	
	public void acelerar() {
		
		System.out.println("O carro acelerou !!!");
		
	}
	
		
	
	
}

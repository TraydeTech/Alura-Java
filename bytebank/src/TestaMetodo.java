
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoJeff = new Conta();
		contaDoJeff.saldo = 100;
		contaDoJeff.deposita(50);
		
		System.out.println(contaDoJeff.saldo);
		
		
		boolean conseguiuRetirar = contaDoJeff.saca(20);
		System.out.println(contaDoJeff.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela= new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(3000, contaDoJeff)) {
			System.out.println("Transfereincia com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoJeff.saldo);
		
		contaDoJeff.titular = "Jefferson Trayde";
		System.out.println(contaDoJeff.titular);
	}

}


public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaAmanda = new Conta();
		contaDaAmanda.saldo = 100;
		contaDaAmanda.deposita(50);
		System.out.println(contaDaAmanda.saldo);
		
		boolean conseguiuRetirar = contaDaAmanda.saca(20);
		System.out.println(contaDaAmanda.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDaAmanda);
		if(sucessoTransferencia) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Erro na transferencia: Faltou saldo");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaAmanda.saldo);
		
		contaDaAmanda.titular = "Amanda Godoy Lima";
		System.out.println(contaDaAmanda.titular);
	}
}

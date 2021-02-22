
public class TestaBanco {

	public static void main(String[] args) {
		Cliente amanda = new Cliente();
		amanda.nome = "Amanda Godoy Lima";
		amanda.cpf = "111.222.888-66";
		amanda.profissao = "programador";
		
		Conta contaDaAmanda = new Conta();
		contaDaAmanda.deposita(100);
		
		contaDaAmanda.titular = amanda;
		System.out.println(contaDaAmanda.titular.nome);
	}
}

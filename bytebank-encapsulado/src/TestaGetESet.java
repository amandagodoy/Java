
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());

		Cliente amanda = new Cliente();
		//conta.titular = amanda;
		amanda.setNome("Amanda Godoy Lima");
		
		conta.setTitular(amanda);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(amanda);
		System.out.println(conta.getTitular());
		
	}
}

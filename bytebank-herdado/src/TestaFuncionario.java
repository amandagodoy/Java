
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente amanda = new Gerente();
		amanda.setNome("Amanda Ramona");
		amanda.setCpf("1245438460");
		amanda.setSalario(2600);

		System.out.println(amanda.getNome());
		System.out.println(amanda.getBonificacao());
		
//		amanda.salario = 300.0; 
	}

}

// Gerente � um Funcion�rio, Gerente herda da class Funcion�rio
public class Gerente extends Funcionario {

	private int senha; 
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonifica��o do GERENTE");
		return super.getSalario();
	}
	
	
}

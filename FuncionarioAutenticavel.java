
public class FuncionarioAutenticavel extends Funcionario {
	private int senha = 1234;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		}

		else {
			System.out.println("Acesso negado");
			return false;
		}

	} // fim autentica
}

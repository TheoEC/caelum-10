
class Gerente extends Funcionario implements Autenticavel {
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

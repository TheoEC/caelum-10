
public class teste {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		Gerente gerente = new Gerente();
		SistemaInterno sistemaInterno = new SistemaInterno();
		System.out.println("certo");
		sistemaInterno.login(diretor);
		sistemaInterno.login(gerente);
	}

}

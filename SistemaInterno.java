import java.util.Scanner;

public class SistemaInterno {
	Scanner inpt = new Scanner(System.in);

	void login(Autenticavel a) {
		int senha = inpt.nextInt();
		a.autentica(senha);
	}

}

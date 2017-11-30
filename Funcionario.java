
class Funcionario {
	protected String nome;
	protected double salario;
	
	public double getBonificacao() {
		return this.salario * 1.2; 
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

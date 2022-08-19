//super class
//classes abstratas não podem ser instanciadas pois são abstratas
public abstract class Funcionario {

	private String nome;
	private int cpf;
	protected double salario; //PROTECTED --- PUBLICO PARA OS FILHOS
	//private int tipo = 0; // 0 funcionario - 1 gerente - 2 diretor

	
	
	
	
	public abstract double getBonificacao(); //método abstrato, deve ser desenvolvido nas classes filhas
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//	public Funcionario(int cpf, String nome) {
//		this.cpf = cpf;
//		this.nome= nome;
//	}

	
}

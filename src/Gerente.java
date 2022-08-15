//gerente herda classe funcionario
//classe filho
public class Gerente extends Funcionario {

	//private int tipo = 0; // 0 funcionario - 1 gerente - 2 diretor
	private int senha;

	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
		return true;
		}else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
//	public double getBonificacao() {
//		
//		
//		if (tipo == 0) { // funcionario
//			return this.salario * 0.10;
//		} else if (tipo == 1) { // gerente
//			return this.salario;
//		} else {
//			return this.salario * 1000.0; // diretor
//		}
//
//	}
	
	public double getBonificacao() {
		return super.salario + super.getBonificacao(); //não utilizado .this pois o atributo salario está em outra classe, na classe mãe (Funcionario)
	}
	
//	public Gerente(int cpf, String nome) {
//		this.cpf = cpf;
//		this.nome= nome;
//	}


}

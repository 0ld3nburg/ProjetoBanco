
public class ControleBonificacao {

public double soma;

public void registra (Funcionario funcionario) {
	double bonificacao = funcionario.getBonificacao();
	this.soma = this.soma + bonificacao;
	

	
	}



public double getSoma() {
	return soma;
}

public void setSoma(double soma) {
	this.soma = soma;
}
}

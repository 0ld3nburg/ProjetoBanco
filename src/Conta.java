
public class Conta {

	private double saldo; //ATRIBUTOS
	private int agencia;
	private int numero;
	private Cliente titular; //COMPOSIÇÃO, RELACIONAMENTO ENTRE CLASSES
	
	
	private static int total; //possível de ser inicializado em qualquer parte da classe, 
	//mas quando recebe um valor, ele é compartilhado com todos os objetos da classe. 
	//Isso significa que os atributos estáticos de uma classe são compartilhados por todas as instâncias dessa classe
	
	// O QUE ESTÁ ENTRE () É PARÂMETRO
	
	
	// INVOCAR MÉTODO SEMPRE COM ()
	public void deposita(double valor) { //MÉDOTO 1
		this.saldo += valor;
	}
	
	public boolean saca (double valor) { // MÉTODO 2
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Você sacou " + valor);
			return true;
		}else {
			System.out.println("Você não tem saldo suficiente");
			return false;
		}
	}
		
	public boolean transfere (double valor, Conta destino) { // MÉTODO 3
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	
	public static int getTotal() {
		System.out.println("Teste");
		return total;
	}
	
	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	public Conta(int agencia, int numero){
		Conta.total++;
		System.out.println("impressão");
		this.agencia = agencia;
		this.numero = numero;
		System.out.println(Conta.getTotal());
		if (agencia <= 0) {
			System.out.println("Agencia não permitida");
		
		}
	}
	
	
	
}



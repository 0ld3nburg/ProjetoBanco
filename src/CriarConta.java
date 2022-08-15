
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(52, 65);
		Conta contaDoCarlos = new Conta(99, 800);

//		primeiraConta.saldo = 1000;
		primeiraConta.deposita(500);
		System.out.println(primeiraConta.getSaldo());

		primeiraConta.saca(3000);
		System.out.println(primeiraConta.getSaldo());

//		contaDoCarlos.titular = new Cliente();
//		contaDoCarlos.titular.nome = "Carlos";
//		System.out.println(contaDoCarlos.titular.nome);
//		contaDoCarlos.titular.endereco = "aqui";
//		System.out.println(contaDoCarlos.titular.endereco);
//		contaDoCarlos.deposita(1000);

		contaDoCarlos.transfere(750, primeiraConta);
		System.out.println(contaDoCarlos.getSaldo());
		System.out.println(primeiraConta.getSaldo());

		contaDoCarlos.setNumero(123);
		System.out.println("O numero  " + contaDoCarlos.getNumero());
		contaDoCarlos.setNumero(500);
		System.out.println(contaDoCarlos.getNumero());

		Conta segundaConta = new Conta(-1, 395);
		Cliente segundoCliente = new Cliente();
		segundaConta.setTitular(segundoCliente);

		segundoCliente.setNome("Carlos");
		segundoCliente.setEndereco("Lajeado");

		System.out.println(segundaConta.getTitular().getNome());
		System.out.println(segundaConta.getTitular().getEndereco());

		segundaConta.getTitular().setEndereco("Estrela");
		System.out.println(segundaConta.getTitular().getEndereco());

		System.out.println(segundaConta.getTitular());
		System.out.println(segundoCliente);
		System.out.println(Conta.getTotal());

		Gerente gerente1 = new Gerente();
		gerente1.setNome("Fulano");
		gerente1.setCpf(1234567890);
		gerente1.setSalario(2000);

		
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getNome());

		Funcionario funcionario1 = new Funcionario();

		funcionario1.setSalario(1000);
		System.out.println("A bonificação eh " + funcionario1.getBonificacao());

		gerente1.setSenha(2222);
		System.out.println(gerente1.autentica(2222));
		
		System.out.println(funcionario1.getCpf());
		System.out.println(funcionario1.getNome());
		
		
		System.out.println(gerente1.getSalario());
		System.out.println("A bonificação do gerente eh " + gerente1.getBonificacao());

	}
}

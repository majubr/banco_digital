package desafio_dio_banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	public void imprimirExtrato() {
		System.out.println ("==Extrato conta corrente==");
		super.imprimirInfosComuns();
	}

	
	
}


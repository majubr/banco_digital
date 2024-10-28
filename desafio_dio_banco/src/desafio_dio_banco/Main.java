package desafio_dio_banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco banco = new Banco();
		banco.setNome("Banco Rural");
		
		System.out.println("Bem vindo ao " + banco.getNome());
		
		String resposta = "sim";
		Scanner leitor = new Scanner(System.in);
		
		while (resposta.contentEquals("sim")) {
		
		Cliente cliente = new Cliente ();
		
		System.out.println("Escreva o nome do cliente: ");
		
		
		
		cliente.setNome (leitor.next());
		
		Conta cc = new ContaCorrente(cliente);
		System.out.println("Gostaria de fazer um deposito na conta corrente para o cliente? (sim ou nao))");
		String deposito_if = leitor.next();
		
		if (deposito_if.contentEquals("sim")){
			System.out.println("Digite o valor: ");
			cc.depositar(leitor.nextInt());
		} else {
			System.out.println("ok, obrigado");
		}
		
		Conta poupanca = new ContaPoupanca(cliente);
		System.out.println("Gostaria de fazer uma transferencia para a conta poupanca do cliente? (sim ou nao)");
		String transferencia_if = leitor.next();
		
		if (transferencia_if.contentEquals("sim")) {
			System.out.println("Digite o valor da transferencia: ");
			cc.transferir(leitor.nextInt(), poupanca);
		} else {
			System.out.println("ok, obrigado");
		}
		
		
		
		
		
		banco.imprimirBanco();
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		banco.adicionarConta(cc);

		System.out.println ("Gostaria de cadastrar mais um cliente? ");
		
		resposta = leitor.next();
		
		}
		
		leitor.close();
		
		System.out.println ("contas correntes cadastradas abaixo! ");
		
		banco.imprimirContas();
		
	}

}

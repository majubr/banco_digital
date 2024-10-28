package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void imprimirBanco() {
		System.out.println ("==Nome do banco==");
		System.out.println(nome);
	}
	

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}	
	
	
	public void imprimirContas () {
		System.out.println("==Contas bancarias==");	

		 for (Conta conta : contas) {
             conta.imprimirExtrato();
         }
	}


		

}

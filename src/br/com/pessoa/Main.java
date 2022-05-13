package br.com.pessoa;

public class Main {

	public static void main(String[] args) {
		
		
		NovaPessoa mostrarPessoa = new NovaPessoa();
		
		System.out.println("PESSOA GERADA:::" + mostrarPessoa.gerarPessoa().getNome());
		

	}

}

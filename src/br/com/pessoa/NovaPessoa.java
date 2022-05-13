package br.com.pessoa;

public class NovaPessoa {
	
	public Pessoa gerarPessoa() {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Valdir");
		pessoa.setIdade("99");
		pessoa.setCpf("888.888.888-77");
		
		return pessoa;
		
	}

}

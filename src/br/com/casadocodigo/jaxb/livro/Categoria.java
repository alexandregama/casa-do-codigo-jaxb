package br.com.casadocodigo.jaxb.livro;

public class Categoria {

	private String nome;

	@Override
	public String toString() {
		return "Categoria [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

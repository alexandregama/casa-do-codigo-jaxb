package br.com.casadocodigo.jaxb.livro;

import java.math.BigDecimal;

public class LivroBuilder {

	private Livro livro = new Livro();
	
	public LivroBuilder comCodigo(String codigo) {
		livro.setCodigo(codigo);
		return this;
	}
	
	public LivroBuilder comTitulo(String titulo) {
		livro.setTitulo(titulo);
		return this;
	}
	
	public LivroBuilder doAutor(String autor) {
		livro.setAutor(autor);
		return this;
	}

	public LivroBuilder custando(Double valor) {
		livro.setValor(new BigDecimal(valor));
		return this;
	}
	
	public LivroBuilder daCategoria(String nomeCategoria) {
		Categoria categoria = new Categoria();
		categoria.setNome(nomeCategoria);
		livro.setCategoria(categoria);
		return this;
	}
	
	public Livro build() {
		return this.livro;
	}

}

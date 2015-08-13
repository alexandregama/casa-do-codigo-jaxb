package br.com.casadocodigo.jaxb.livro;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Opcional quando geramos um livro com Categoria. Obrigatório se fizermos o Marshall direto da Categoria
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

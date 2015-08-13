package br.com.casadocodigo.jaxb.livro;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Livro {

	private String codigo;
	private String titulo;
	private String autor;
	private BigDecimal valor;
	
	@Override
	public String toString() {
		return "Livro [codigo=" + codigo + ", titulo=" + titulo + ", autor="
				+ autor + ", valor=" + valor + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}

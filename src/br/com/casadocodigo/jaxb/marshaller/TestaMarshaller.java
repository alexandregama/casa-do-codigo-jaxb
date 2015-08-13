package br.com.casadocodigo.jaxb.marshaller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.casadocodigo.jaxb.livro.Livro;
import br.com.casadocodigo.jaxb.livro.LivroBuilder;

public class TestaMarshaller {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Livro livro = new LivroBuilder()
				.comCodigo("ARQ")
				.comTitulo("Arquitetura")
				.doAutor("Silveira")
				.custando(40d)
				.build();

		JAXBContext context = JAXBContext.newInstance(Livro.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(livro, new FileOutputStream("livro.xml"));
	}

}

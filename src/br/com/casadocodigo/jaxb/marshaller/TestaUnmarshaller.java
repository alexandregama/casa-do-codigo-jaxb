package br.com.casadocodigo.jaxb.marshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.casadocodigo.jaxb.livro.Livro;

public class TestaUnmarshaller {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Livro livro = (Livro) unmarshaller.unmarshal(new File("livro.xml"));
		
		System.out.println("Livro gerado a partir do xml:" + livro);
	}
	
}

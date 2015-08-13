package br.com.casadocodigo.jaxb.schema;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import br.com.casadocodigo.jaxb.livro.Livro;

public class TestaSchema {

	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		
		context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				StreamResult stream = new StreamResult(new File("livro-namespace.xsd"));
				return stream;
			}
		});
	}
	
}

import model.Book;
import model.Catalog;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Books {
	
	private static final String BOOKSIN_XML = "./BooksIN.xml";
	private static final String BOOKSOUT_XML = "./BooksOUT.xml";
	 
	public static void main(String[] args) throws JAXBException, IOException {
		
		// ===================================== JAXB read===========================
		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(Catalog.class);

		// get variables from our xml file, created before
		System.out.println();
		System.out.println("Output from our XML File: ");

		// Unmarshalling (reading) XML instance documents into Java content
		// trees
		Unmarshaller um = context.createUnmarshaller();
		Catalog c2 = (Catalog) um.unmarshal(new FileReader(BOOKSIN_XML));
		ArrayList<Book> list = c2.getBooksList();

		for (Book book : list) {
			System.out.println(book.toString());
		}
		
		//===================================== JAXB write =======================================================
				
		Marshaller m = context.createMarshaller();
		// formatted as human readable XML
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(c2, System.out);

		// Write to File
		m.marshal(c2, new File(BOOKSOUT_XML));
	}
	
}

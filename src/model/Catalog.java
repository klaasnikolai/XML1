package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import model.Book;

@XmlRootElement(namespace = "catalog")
public class Catalog {

	// XmLElementWrapper generates a wrapper element around XML representation
		@XmlElementWrapper(name = "catalog")
		// XmlElement sets the name of the entities
		private ArrayList<Book> book;

		public void setBookList(ArrayList<Book> bookList) {
			this.book = bookList;
		}

		public ArrayList<Book> getBooksList() {
			return book;
		}
}

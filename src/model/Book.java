package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "book")
@XmlType(propOrder = { "author", "title", "genre", "price", "publish_date", "description"})
public class Book {
	
	public Book(){
		setAuthor("Niko");
		setTitle("Ich Liebe Julia");
		setGenre("Roman");
		setPrice("1000");
		setPublish_date("29.03.2010");
		setDescription("<3");
	}
	
	
	public Book(String author, String title, String genre, String price,
			String publish_date, String description) {
		super();
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.publish_date = publish_date;
		this.description = description;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", genre="
				+ genre + ", price=" + price + ", publish_date=" + publish_date
				+ ", description=" + description + "]";
	}

	private String author, title, genre, price, publish_date, description;

	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desctiption) {
		this.description = desctiption;
	}
	

}

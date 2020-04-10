package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book2")
public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int ISBN;
	private String title;
	private double price;
	
	public Book() {
		
	}

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

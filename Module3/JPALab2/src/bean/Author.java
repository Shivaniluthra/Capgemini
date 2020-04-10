package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author2")
public class Author {
	@Id
	private int id;
	private String name;
	@OneToMany(
		cascade = CascadeType.ALL 
	//	,orphanRemoval = true
	)
	@JoinColumn(name="AuthorId")
	private List<Book> books= new ArrayList<Book>();
	
	public Author() {
		
	}

	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}

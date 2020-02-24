package com.javalabbook.lab2;
import java.util.*;
abstract class Item{
	
	private int id;
	private int no_copies;
	private String title;
	
	abstract void display();
	
	public Item(){
		no_copies=0;
		id=0;
		title="";
	}
	
	public Item(int id,int no_copies,String title){
		this.no_copies=no_copies;
		this.id=id;
		this.title=title;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id; 
	}
	
	public void setNoCpy(int no_copies) {
		this.no_copies=no_copies;
	}
	
	public int getNoCpy() {
		return no_copies;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void checkOut() {
		no_copies--;
	}
	
	public void checkIn() {
		no_copies++;
	}
	
	public void addItem() {
		no_copies++;
	}
	
	public void print() {
		System.out.println("Title: "+title);
		System.out.println("ID: "+id);
		System.out.println("Number of copies: "+no_copies);
	}
}

abstract class WrittenItem extends Item{
	private String author;	
	
	public int getId(){
		return super.getId();
		}
	public String getTitle(){
		return super.getTitle();
		}
	public int getNoCpy(){
		return super.getNoCpy();
		}
		
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public WrittenItem() {
		super();
	}
	
	public WrittenItem(int i, int noCpy, String st) {
		super(i,noCpy,st);
	}
	
	abstract void read(String title); 
}

class Book extends WrittenItem{
	ArrayList<String> books_list=new ArrayList<String>();
	
	public Book() {
		super();
	}
	
	public Book(int i, int noCpy, String st) {
		super(i,noCpy,st);
	}

	public int getId(){
		return super.getId();
		}
	public String getTitle(){
		return super.getTitle();
		}
	public int getNoCpy(){
		return super.getNoCpy();
		}
	
	public Book(String author) {
		super.setAuthor(author);
	}
	
	public void read(String title) {
		System.out.println("Reading Book " +title+ " of author " +getAuthor());
	}
	
	public void print() {
		System.out.println("Author: " +getAuthor());
		super.print();
	 }
	
	public void addBook(Object obj) {
		books_list.add((String)obj);
	}
	
	public void display() {
		System.out.println("Displaying all books:");
		Iterator itr=books_list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.println();
		}
	}

}

class JournalPaper extends WrittenItem{
	private int year_published;
	ArrayList<String> paper_list=new ArrayList<String>();
	
	public int getId(){
		return super.getId();
		}
	public String getTitle(){
		return super.getTitle();
		}
	public int getNoCpy(){
		return super.getNoCpy();
		}
	
    public void setYear(int year_published) {
		this.year_published=year_published;
	}
	
	public int getYear() {
		return year_published;
	}
	
	public JournalPaper() {
		super();
	}
	
	public JournalPaper(int i, int noCpy, String st) {
		super(i,noCpy,st);
	}
	
	public JournalPaper(String author) {
		super.setAuthor(author);
	}
	
	public void read(String title) {
		System.out.println("Reading Journal " +title);
	}
	
	public void print() {
		super.print();
		System.out.println("Year published" +getYear());
	 }
	
	void addPaper(Object obj) {
		paper_list.add((String)obj);
	}
	
	void display() {
		Iterator itr=paper_list.iterator();
		System.out.println("Displaying all papers:");
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.println();
		}
	}
}

abstract class MediaItem extends Item{
	abstract void play(String title);
	
	public MediaItem() {
		super();
	}
	
	public MediaItem(int i, int noCpy, String st) {
		super(i,noCpy,st);
	}
	
}

class Video extends MediaItem{
	private String director;
	private String genre;
	private int year_released;
	
	public Video() {
		super();
	}
	
	public Video(int i, int noCpy, String st) {
		super(i,noCpy,st);
	}
	
	public void setDirector(String director) {
		this.director=director;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setYear(int year_released) {
		this.year_released=year_released;
	}
	
	public int getYear() {
		return year_released;
	}
	
	public void play(String title) {
		System.out.println("Playing Video "+title+"of director "+getDirector());
	}
	
	public void print() {
		System.out.println("Director: "+getDirector());
		System.out.println("Genre: "+getGenre());
		System.out.println("Released Year: "+getYear());
		super.print();
	}
	
	public void display() {
		
	}
}

class CD extends MediaItem{
	private String artist;
	private String genre;
	
	public CD() {
		super();
	}
	
	public CD(int i, int noCpy, String st) {
		super(i,noCpy,st);
	}
	
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	@Override
	void play(String title) {
		// TODO Auto-generated method stub
		System.out.println("Playing CD "+title+"of artist "+getArtist());
	}
	
	public void print() {
		System.out.println("Director: "+getArtist());
		System.out.println("Genre: "+getGenre());
		super.print();
	}
	
	public void display() {
		
	}
}

public class Lab2 {
	public static void main(String[] args) {
		Book b1=new Book(1,001,"See Me");
		b1.print();
		b1.addBook(b1.getTitle());
		b1.display();
	}

}

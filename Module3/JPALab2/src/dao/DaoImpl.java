package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import bean.Book;
import config.MyFactory;

public class DaoImpl {
	EntityManager em= MyFactory.getEntityManager();
	EntityTransaction tx= em.getTransaction();
	
	public List<Book> displayAllBooks(){
		Query q= em.createQuery("from Book b");
		List<Book> li= q.getResultList();
		return li;
	}
	
	public List<Book> getBooksByAuthorName(String name){
		Query q= em.createQuery("select books from Author a where a.name= :n");
		q.setParameter("n", name);
		List<Book> li= q.getResultList();
		return li;
	}
	
	public List<Book> bookWithinPrice(double l, double h){
		Query q= em.createQuery("from Book b where b.price between :low and :high");
		q.setParameter("low", l);
		q.setParameter("high", h);
		List<Book> li= q.getResultList();
		return li;
	}
	
	public String authorNameByBookId(int id) {
		Query q= em.createQuery("select a.name from Author a join a.books b where b.ISBN= :isbn");
		q.setParameter("isbn", id);
		String name= q.getSingleResult().toString();
		return name;
	}
}

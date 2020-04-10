package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import bean.Author;
import config.MyFactory;
import exceptions.authorNotFoundException;

public class AuthorDao {
	EntityManager em= MyFactory.getEntityManager();
	EntityTransaction tx= em.getTransaction();
	
	public String insertAuthor(Author a) {
		tx.begin();
		em.persist(a);
		tx.commit();
		return "Author inserted !!";
	}
	
	public String updatePhoneNo(int id, long pNo) {
		Author a= em.find(Author.class, id);
		if(a!=null) {
			tx.begin();
			a.setPhoneNo(pNo);
			tx.commit();
			return "Phone number updated !!";
		}
		return "**No such Author found**";
	}
	
	public String deleteAuthor(int id) {
		Author a= em.find(Author.class, id);
		if(a!=null) {
			tx.begin();
			em.remove(a);
			tx.commit();
			return "Author with id "+id+" deleted successfully!!";
		}
		return "**No such Author found**";
	}
	
	public Author findAuthorById(int id) throws authorNotFoundException {
		Author a= em.find(Author.class, id);
		if(a==null) {
			throw new authorNotFoundException("Author not found");
		}
		return a;
	}
}

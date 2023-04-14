package controller;

import model.User;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

public class MainProject {
	
	static EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA_java");
	static EntityManager em = emf .createEntityManager();

	public static void main(String[] args) {
		
		
		
		User u = new User();
		u.setName("Giuseppe");
		u.setLastname("Verdi");
		u.setEmail("g.verdi@gmail.com");
		//con questo noi andiamo a creare un'istanza.
		
		
		
	try {
		//addUser(u);
		User utenteLetto = findUser(1l);//trovare un utente tramite l'id
		//System.out.println(utenteLetto);
		
		utenteLetto.setEmail("test@gmail.com");//modificare un elemento della tabella (in questo caso abbimao modifcato l'email)
		updateUser(utenteLetto);
		
		removeUser(utenteLetto);
	}catch (Exception e) {
		
	}finally {
		em.close();
		emf.close();
	}
		}
		
	
	
	
	public static void addUser(User u) {
		em.getTransaction().begin();//apri transazione
		em.persist(u);//devi salvare
		em.getTransaction().commit();//salva
		System.out.println("Utente salvato nel DB");
	}
	
	public static User findUser(long id){
		em.getTransaction().begin(); //apri transazione
		User u = em.find(User.class, id);//cerca l'user all'interno della classe User collegata al DB
		em.getTransaction().commit();//Mi prende l'utente
		return u;
	}
	
	public static void updateUser(User u){
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("Utente modificato nel DB");
		System.out.println(u.getEmail());
		}
	
	public static void removeUser(User u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("utente eliminato nel db");
	}
}

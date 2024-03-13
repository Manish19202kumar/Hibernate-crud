package hibernate_project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tester {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		// adding
		// Students1 s=new Students1();
		// s.setAge(35);
		// s.setName("msd");
		// t.begin();
		// m.persist(s); // persist method is used to add the object into table
		// t.commit();

		// fecthing
		// Students1 s = m.find(Students1.class, 30);// find method is used to
		// // fecth the object
		// System.out.println(s);

		// deleting
		Students1 s = m.find(Students1.class, 30);
		t.begin();
		m.remove(s);
		t.commit();
	}

}

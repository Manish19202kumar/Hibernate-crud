package hibernate_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass1 {
	public static void main(String[] args) throws IOException {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Employee1 emp = new Employee1();
		emp.setId(30);
		emp.setName("dinga");
		FileInputStream f = new FileInputStream("C:\\Users\\MANISH KUMAR\\Downloads\\my video.mp4");
		byte[] b = new byte[f.available()];
		f.read(b);
		emp.setDoc(b);
		t.begin();
		m.persist(emp);
		t.commit();

	}
}

package hibernate_project;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		System.out.println("done");
	}
}

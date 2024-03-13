package Dyanmic_input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
public static void main(String[] args) throws IOException {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
//	inserting object
	Scanner sc=new Scanner(System.in);
	Employee emp=new Employee();
	System.out.println("enter your name");
	emp.setName(sc.next());
	System.out.println("enter sal");
	emp.setSal(sc.nextDouble());
	
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the image path");
    FileInputStream f=new FileInputStream(sc2.nextLine());
    byte[] b=new byte [f.available()];
    f.read();
//    to send the file from java to database
    emp.setPic(b);
    t.begin();
    m.persist(emp);
    t.commit();
     
//    fetching the object
//    
//    Employee emp1=m.find(Employee.class,1);
//    System.out.println(emp1.getId());
//    System.out.println(emp1.getName());
//    System.out.println(emp1.getSal());
//    
////    to send the from java to system storage
//    FileOutputStream f1= new FileOutputStream("C:\\Users\\MANISH KUMAR\\Desktop\\hiber\\Manish.jpg");
//////    to get file from the database to java 
//      f1.write(emp1.getPic());

}

}

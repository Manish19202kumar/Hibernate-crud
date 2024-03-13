package dao;


import java.io.FileInputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Employee;
public class EmployeeDao {
EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
EntityManager m=e.createEntityManager();
EntityTransaction t=m.getTransaction();

//for adding the object
public void addEmployee(String ename, double esal, String eimage)
{
	Employee emp=new Employee();
	emp.setEname(ename);
	emp.setEsalary(esal);
	FileInputStream f;
	try{
		f=new FileInputStream(eimage);
		byte[]b=new byte[f.available()];
		emp.setEimage(b);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	t.begin();
	m.persist(emp);
	t.commit();
}
//  fetching the object
public void fecthEmployee(int eid)
{
	Employee emp=m.find(Employee.class,eid);
	System.out.println("Name:" +emp.getEname());
	System.out.println("Salary:" +emp.getEsalary());
	try{
		FileOutputStream f=new FileOutPutStream("C:\\Users\\MANISH KUMAR\\Desktop");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

//updating the emplyoyee

public void UpdateEmployrr(int eid, String newName)
{
	Employee emp=m.find(Employee.class, eid);
	emp.setEname(newName);
	t.begin();
	m.merge(emp);
	t.commit();
}

//removing the employee

public void removeEmployee(int eid)
{
	Employee emp=m.find(Employee.class, eid);
	t.begin();
	m.remove(emp);
	t.commit();
}
}

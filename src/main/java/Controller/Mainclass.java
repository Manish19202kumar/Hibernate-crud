package Controller;


import java.util.Scanner;

import dao.EmployeeDao;

public class Mainclass {
EmployeeDao e=new EmployeeDao();
boolean flag=true;
Scanner sc= new Scanner(System.in);
while(flag)
{
	System.out.println("1. Add Employee");
	System.out.println("2. Fetch Employee");
	System.out.println("3. Update Employee");
	System.out.println("4. Remove Employee");
	System.out.println("5. Exit");
	System.out.println("select valid option");
	
	switch(sc.nextInt())
	{
	case 1:
	{
		System.out.println("enter name");
	}
	}
}
}

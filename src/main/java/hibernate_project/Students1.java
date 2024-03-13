package hibernate_project;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Students1 {
	@Id
	private int age;
	private String name;
 public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
 


@Override
	public String toString() {
		return "Students1 [age=" + age + ", name=" + name + "]";
	}

}

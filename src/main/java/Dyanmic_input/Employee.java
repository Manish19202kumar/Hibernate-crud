package Dyanmic_input;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
@Column(unique=true, nullable=false)
private String name;
private double sal;
@Lob
private byte[] pic;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public byte[] getPic() {
	return pic;
}
public void setPic(byte[] pic) {
	this.pic = pic;
}

}


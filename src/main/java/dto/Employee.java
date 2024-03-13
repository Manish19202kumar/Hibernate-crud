package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  int id;
@Column(unique=true, nullable=false)
private double esalary;
@Column(nullable=false)
@Lob
private byte[]eimage;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
public byte[] getEimage() {
	return eimage;
}
public void setEimage(byte[] eimage) {
	this.eimage = eimage;
}
}

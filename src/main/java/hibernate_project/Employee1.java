package hibernate_project;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Employee1 {
@Id
private int id;
private String name;
@Lob
private byte doc[];
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
public byte[] getDoc() {
	return doc;
}
public void setDoc(byte[] doc) {
	this.doc = doc;
}

}




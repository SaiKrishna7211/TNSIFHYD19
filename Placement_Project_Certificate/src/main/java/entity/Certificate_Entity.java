package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate_Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int year;
	private String college;
	public Certificate_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate_Entity(long id, int year, String college) {
		super();
		this.id = id;
		this.year = year;
		this.college = college;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Certificate_Entity [id=" + id + ", year=" + year + ", college=" + college + "]";
	}
	
}

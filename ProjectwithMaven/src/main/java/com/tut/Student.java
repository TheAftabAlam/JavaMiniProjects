package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="Student_ID")
	private int id;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_Marks")
	private int marks;
	@Column(name="Student_Certificate")
	private Certificate certificate;
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int id, String name, int marks, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.certificate = certificate;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", certificate=" + certificate + "]";
	}
	
}

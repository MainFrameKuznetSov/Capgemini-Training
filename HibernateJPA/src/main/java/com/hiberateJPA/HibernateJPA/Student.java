package com.hiberateJPA.HibernateJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column
	private String name;
	
	@Column
	private int grade;
	
	@Column
	private int age;
	
	@Column(unique=true)
	private long mobno;
	
	public Student() {
		super();
	}
	
	public Student(String id, String name, int grade, int age, long mobno) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.mobno = mobno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
}

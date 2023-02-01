package com.example.demo.beans;

public class Student {
	public Student(String name, int contact, int marks) {
		super();
		this.name = name;
		this.contact = contact;
		this.marks = marks;
	}
	private String name;
	private int contact;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", contact=" + contact + ", marks=" + marks + ", getName()=" + getName()
				+ ", getContact()=" + getContact() + ", getMarks()=" + getMarks() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

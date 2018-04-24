package com.mr.inheritance.vehicleexample;

public class Student {
	int stno;
	String name;

	public Student() {
		// super();
		// this(10, "Alpha");
	}

	public Student(int stno, String name) {
		this.stno = stno;
		this.name = name;
	}

	public static void main(String[] args) {
		Student s = new Student();
	}

}

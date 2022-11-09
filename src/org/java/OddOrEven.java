package org.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Geek {
	int Age = 0;
	String Name;
	long Id=0;

	// constructor with one argument
	Geek(String name) {
		Name=name;
		System.out.println("Constructor with one " + "argument - String : " + name);
	}

	// constructor with two arguments
	Geek(String name, int age) {
		Age=age;
		Name=name;		
		System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " " + age);
	
	}

	// Constructor with one argument but with different
	// type than previous..
	Geek(long id) {
		Id=id;
		System.out.println("Constructor with one argument : " + "Long : " + id);
	}

	public void GetStudentNameAge() {
		System.out.println("Name " + Name);
		System.out.println("Age " +  Age);
	}
	
	public void GetStudentNameID()
	{
		System.out.println("Name " + Name);
		System.out.println("ID " +  Id);
	}
	public void GetStudentName() {
		System.out.println("Name " + Name);
		
	}
	

}

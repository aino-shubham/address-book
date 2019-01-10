package main.java.com.addressbook;

import java.util.Scanner;

public class MenuItem 
{
	int id;
	String name;
	
	
	MenuItem(String name)
	{
		this.name=name;
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
}

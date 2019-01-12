package main.java.com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
	
	int id;
	String name;
	MenuItem mi=new MenuItem(name);
	
	public Menu(String name) {
		
		this.name = name;
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
	
	
	
	ArrayList<MenuItem> al=new ArrayList<MenuItem>();
	void AddMenuItem(MenuItem m)
	{
		al.add(m);
		
	}
	
	
	
}

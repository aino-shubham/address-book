package main.java.com.addressbook;

import java.util.Scanner;
import java.util.Iterator;



public class MenuCrudConsoleUtil 
{
	
	
	
	Menu createMenu()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Menu ");
		String m_name=sc.next();
		Menu m=new Menu(m_name);
		m.setName(m_name);
		return m;
	}
	
	void createMenuItem(Menu m)
	{
		
		int i=0;
        while(i<4){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Menu Item");
		String m_name=sc.next();
		MenuItem mi=new MenuItem(m_name);
		mi.setName(m_name);
		m.AddMenuItem(mi);
		i++;
        }
	}
	
	
	void displayMenuItem(Menu m)
	{
		for(MenuItem obj1:m.al)
		{
			System.out.println(obj1.name);
		}
	}
	
}

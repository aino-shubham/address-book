import java.util.Scanner;

import main.java.com.addressbook.MenuItem;

import java.awt.Menu;
import java.util.Iterator;



public class MenuCrudConsoleUtil 
{
	
	
	
	public Menu createMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Menu ");
		String m_name=sc.next();
		Menu m=new Menu(m_name);
		m.setName(m_name);
		return m;
	}
	
	public void createMenuItem(Menu m)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Menu Item");
		String m_name=sc.next();
		while(!(m_name.equals("Exit"))){
		
			
		MenuItem mi=new MenuItem(m_name);
		mi.setName(m_name);
		m.AddMenuItem(mi);
		 m_name=sc.next();
		
        }
	}
	
	
	void displayMenuItem(Menu m)
	{	Scanner input=new Scanner(System.in);
		System.out.println("Menu Items are");
		int i=1;
		for(MenuItem obj1:m.al)
		{
			System.out.println(i++ +"."+obj1.name);
		}
		
		
	}
	
}

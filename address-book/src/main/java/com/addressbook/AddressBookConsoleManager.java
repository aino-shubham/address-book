package main.java.com.addressbook;

import java.util.Scanner;

public class AddressBookConsoleManager 
{
	public static void main(String args[])
	{
		MenuCrudConsoleUtil obj=new MenuCrudConsoleUtil() ;
		Menu m;
		m=obj.createMenu();
		obj.createMenuItem(m);
		obj.displayMenuItem(m);
		
	}
}
	
	/*AddressCrudUtil acu=new AddressCrudUtil();
	Address add=new Address();
	AddressBookConsoleManager abcm=new AddressBookConsoleManager();
	
	void ShowMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("**Menu Items**");
		System.out.println("1) Create");
		System.out.println("2) Edit");
		System.out.println("3) Remove");
		System.out.println("4) fetch");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1 :
				abcm.accept();
				acu.create( add.getName());
				break;
				
		case 2 :System.out.println("Enter Your name");
				add.name=sc.next();
				acu.update( add.getName());
				break;
		
		case 3 :System.out.println("Enter Your name");
				add.name=sc.next();
				acu.delete( add.getName());
				break;
				
		case 4 :System.out.println("Enter Your name");
				add.name=sc.next();
				acu.read( add.getName());
				break;
				
		default:System.out.println("Wrong option selected");  

		
		}
		
		
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Your name");
		add.setName(add.name=sc.next());
		
		
		System.out.println("Enter the Country");
		add.setCountry(add.country=sc.next());
		
		System.out.println("Enter the City");
		add.setCity(add.city=sc.next());
		
		System.out.println("Enter the Street");
		add.setCountry(add.street=sc.next());
	
		System.out.println("Enter the Id");
		add.setId(add.id=sc.nextInt());
	
		System.out.println("Enter the Zip");
		add.setZip(add.zip=sc.nextInt());
		
		abcm.ShowMenu();
		
	}
}*/

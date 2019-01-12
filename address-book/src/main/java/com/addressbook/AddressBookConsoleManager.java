package main.java.com.addressbook;

import java.util.Scanner;

public class AddressBookConsoleManager 
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		
		MenuCrudConsoleUtil obj=new MenuCrudConsoleUtil() ;
		Menu m;
		MenuItem mi ;
		m=obj.createMenu();
		obj.createMenuItem(m);
		//obj.displayMenuItem(m);
		
		Address address=null;
		AddressCrudUtil adddress_crud=new AddressCrudUtil();
		
		while(true)
		{
		obj.displayMenuItem(m);
		int menuItem=input.nextInt(); 
		switch(menuItem)
		{
		case 1:address=adddress_crud.create();
				break;
		
		
		
		case 2:System.out.print("Enter The name you want to search");
				String name=input.next();
				adddress_crud.read(name,address);
				break;
		
		
		
		case 3:System.out.print("Enter The name you want to update");
				String name1=input.next();
				adddress_crud.update(name1);
				break;
		
		case 4 :System.out.print("Enter The name you want to Remove");
				String name2=input.next();
				adddress_crud.delete(name2);
				break;
		
		case 0 : System.exit(0); 
		
		
		default:System.out.println("Wrong option selected");  

		}
		}
		}
		
		
		
	
}
		
		
		
		
		
		
		
		
		
		
		/*
		//while(true)
	
		System.out.println("Enter Your Choice");
		String menuItem=input.next(); 
		//System.out.println(mi.name);
		if(m.al.(menuItem))
		
		{
		
		switch(menuItem)
		{
		case "Create" :System.out.println("Hello");
		case "Read" :
		case "Delete" :
		case "Update" :
		default:System.out.println("Wrong option selected");  

		}
		
		}
		else {
			System.out.println("Wrong");
		}
	}
	}
//}
	
//}
	*/

	
	

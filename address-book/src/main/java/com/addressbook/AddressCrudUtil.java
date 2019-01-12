package main.java.com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressCrudUtil

{
	HashMap< String,Address> hm =  new HashMap< String,Address>(); 
	Scanner input=new Scanner(System.in);

	//Add Address
	public Address create()
	{
		Address address=new Address();
		
		System.out.println("Enter Your Name");
		String name=input.next();
		address.setName(name);
		
		System.out.println("Enter Your Country");
		String country=input.next();
		address.setCountry(country);
		
		System.out.println("Enter Your Street");
		String street=input.next();
		address.setStreet(street);
		
		System.out.println("Enter Your City");
		String city=input.next();
		address.setCity(city);
		
		System.out.println("Enter Your Zip");
		int zip=input.nextInt();
		address.setZip(zip);
		
		
		
		
		hm.put(name,address);
		return address;
		
		//System.out.println(hm);
		
	}
	
	//Read Address
	void read(String name,Address address1)
	{
		address1=hm.get(name);
		System.out.println("Name is :" +address1.getName());
		System.out.println("City is : "  +address1.getCity());
		System.out.println("Contry is : "  +address1.getCountry());
		System.out.println("Street is : "  +address1.getStreet());
		System.out.println("Zip is : "  +address1.getZip());
	}
	
	void update(String name)
	{
		Address address=new Address();
		
		System.out.println("Enter Your Country");
		String country=input.next();
		address.setCountry(country);
		
		System.out.println("Enter Your Street");
		String street=input.next();
		address.setStreet(street);
		
		System.out.println("Enter Your City");
		String city=input.next();
		address.setCity(city);
		
		System.out.println("Enter Your Zip");
		int zip=input.nextInt();
		address.setZip(zip);
		
		hm.replace(name, address);
	}
	
	void delete(String name)
	{
		hm.remove(name);
	}
}

package main.java.com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressCrudUtil

{
	
	
	
	Map< String,Address> hm =  new HashMap< String,Address>(); 
	
	void create(String name)
	{
		hm.put(name, new Address());
		
	}
	
	void read(String name)
	{
		hm.get(name);
	}
	
	void update(String name)
	{
		hm.replace(name, new Address());
	}
	
	void delete(String name)
	{
		hm.remove(name);
	}
}

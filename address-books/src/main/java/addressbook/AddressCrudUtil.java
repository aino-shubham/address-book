package addressbook;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressCrudUtil

{
	MySqlAddressStore storesql=new MySqlAddressStore();
	AddressStore store=new MapAddressStore();
	Scanner input=new Scanner(System.in);
	Address address;
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
		
		
		storesql.add(address);
		store.add(address);
		
		return address;
		
		//System.out.println(hm);
		
	}
	
	//Read Address
	void read(String name)
	{
		System.out.println("*****Reading Value From Hashmap*****");
		Address address1=store.read(name);
		System.out.println("Name is :" +address1.getName());
		System.out.println("City is : "  +address1.getCity());
		System.out.println("Contry is : "  +address1.getCountry());
		System.out.println("Street is : "  +address1.getStreet());
		System.out.println("Zip is : "  +address1.getZip());
		
		
		
		
		
		System.out.println("*****Reading Value From Database*****");
		Address address2=storesql.read(name);
		System.out.println("Name is :" +address2.getName());
		System.out.println("City is : "  +address2.getCity());
		System.out.println("Contry is : "  +address2.getCountry());
		System.out.println("Street is : "  +address2.getStreet());
		System.out.println("Zip is : "  +address2.getZip());
	
	}
	
	void update(String name)
	{
		Address address=new Address();
		
		System.out.println("Enter Your Name");
		String Name=input.next();
		address.setName(Name);
		
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
		storesql.update(name, address);
		store.update(name,address);
	}
	
	void delete(String name)
	{
		storesql.delete(name);
		store.delete(name);
	}
}

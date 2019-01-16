package addressbook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLClientInfoException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MySqlAddressStoreTest {

	MySqlAddressStore sql;
	@BeforeClass
	public static void beforClass(){
		MySqlAddressStore sql=new MySqlAddressStore();		
	}
	
	
	@Test
	public void addtest() {
		MySqlAddressStore sql=new MySqlAddressStore();		
		Address address=new Address();
		address.setName("Shubham");
		address.setCountry("India");
		address.setCity("Pune");
		address.setStreet("Wanwadi");
		address.setZip(12);
		int a=sql.add(address);
	 assertTrue(a==1);
		
	}
	
	@Test
	public void readTest() {
		MySqlAddressStore sql=new MySqlAddressStore();
		Address add=sql.read("Shubham");
		assertTrue(add.name.equals("Shubham"));
		assertTrue(add.country.equals("India"));
		assertTrue(add.city.equals("Pune"));
		assertTrue(add.street.equals("Wanwadi"));
		
	}
	
	@Test
	public void updatedTest() {
		MySqlAddressStore sql=new MySqlAddressStore();
		Address address=new Address();
		
		address.setName("Shubham");
		address.setCountry("India");
		address.setCity("Pakistan");
		address.setStreet("Wanw");
		address.setZip(12);
		
		int a=sql.update("Shubham", address);
		 assertTrue(a==1);
		
		
	}
	
	@Test
	public void deleteTest() {
		MySqlAddressStore sql=new MySqlAddressStore();
		int a=sql.delete("Shubham");
		assertTrue(a==1);
	}

}

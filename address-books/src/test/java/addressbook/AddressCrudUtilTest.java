package addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressCrudUtilTest {

	AddressCrudUtil addresscrudutil;
	Address address;
	@Test
	public void createTest() {
		MapAddressStore store=new MapAddressStore();
		AddressCrudUtil addresscrudutil=new AddressCrudUtil();
		address=addresscrudutil.create();
		//assertTrue(address.getName().equals("Shubham"));
		assertTrue(store.hm.get(address.getCity()).city.equals("Pune"));
		//assertTrue(store.hm.get(address.country).country.equals("India"));
		//assertTrue(store.hm.get(address.street).street.equals("Wanwadi"));
	//	assertTrue(store.hm.get(address.zip).zip==123);
	}
	
	@Test
	public void updateTest() {
		MapAddressStore store=new MapAddressStore();
		AddressCrudUtil addresscrudutil=new AddressCrudUtil();
		address=addresscrudutil.create();
		addresscrudutil.update(address.name);
		assertTrue(store.hm.get(address.name).city.equals("Pune"));
		assertTrue(store.hm.get(address.name).country.equals("India"));
		assertTrue(store.hm.get(address.name).street.equals("wadi"));
		assertTrue(store.hm.get(address.name).zip==123);
		
	}
	
	@Test
	public void deleteTest() {
		AddressCrudUtil addresscrudutil=new AddressCrudUtil();
		address=addresscrudutil.create();
		addresscrudutil.delete(address.name);
		assertFalse(addresscrudutil.hm.containsKey(address.name));
	}
	
	

}

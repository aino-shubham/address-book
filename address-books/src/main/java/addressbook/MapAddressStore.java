package addressbook;

import java.util.HashMap;

public class MapAddressStore implements AddressStore{

	HashMap< String,Address> hm=  new HashMap< String,Address>(); 
		
	//Add data to address book
	public int add(Address address) {
		
		hm.put(address.name, address);
		return 1;
	}
	
	
	public Address read(String name) {
		
		
	return hm.get(name);
	
	}
	
	public int update(String name,Address address) {
		hm.replace(name, address);
		return 1;
	}
	
	public int delete(String name) {
		hm.remove(name);
		return 1;
	}
	
	
	
	
	
}

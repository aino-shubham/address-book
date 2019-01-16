package addressbook;

public interface AddressStore {
	
	public int add(Address address);

	public Address read(String name);
	
	public int update(String name,Address address);
	
	public int delete(String name);
	
}

package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlAddressStore implements AddressStore{
	
	Connection connect;
    Statement statement = null;
    PreparedStatement preparedStatement;
    ResultSet resultSet =null;
	public MySqlAddressStore() {
		
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/Address_book","root","mysql");
			statement=connect.createStatement();
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	 
	//Insert THe vale in the database
	public int add(Address address) {
		
		int a = 0;
		String query = " insert into address VALUES ('"+address.getName()+"','"+address.getCountry()+"','"+address.getStreet()+"','"+address.getCity()+"','"+address.getZip()+"' )";
		try {
		 a=	statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a; 
	}

	
	//Read Value from the database
	public Address read(String name) {
		String query="Select * from address where name='"+name+"'";
		Address address=new Address();
		try {
			resultSet=statement.executeQuery(query);
			while(resultSet.next())
			{
			    address.name = resultSet.getString("name");
			    address.country = resultSet.getString("country");
			    address.street= resultSet.getString("street");
			    address.city= resultSet.getString("city");
			    address.zip=resultSet.getInt("zip");
			    
			    
			}
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return address;
		
	}
	
	
	
	//Update value from the database
	public int update(String name,Address address) {
		int a=0;
		String query = "UPDATE address SET  country='"+address.getCountry()+"' , street='"+address.getStreet()+"' , city='"+address.getCity()+"' , zip='"+address.getZip()+"' where name='"+name+"'  ";
		try {
			a=statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a;
	}
	
	public int delete(String name) {
		int a=0;
		String query="Delete from address where name='"+name+"'";
		try {
			a=statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a;
	}
	
}

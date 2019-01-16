package addressbook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.function.Supplier;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;

public class MenuCrudConsoleUtilTest{
	
	Logger logger=Logger.getLogger("Mylogger");

	static MenuCrudConsoleUtil menucrudconsoleutil;
	@BeforeClass
	public static void beforClass(){
		menucrudconsoleutil=new MenuCrudConsoleUtil();
		
	}
	
	@Test
	public void createMenuItemTest() {
		Menu menu=new Menu("AddressBook");
		menucrudconsoleutil.createMenuItem(menu);
		assertTrue(menu.al.get(0).name.equals("Shubham"));
		
	}

	
	@Test
	public void createMenuTest(){
		Menu m;
		m=menucrudconsoleutil.createMenu();
		assertTrue(m.getName().equals("AddressBook"));
		
		
	}
	
	@Test
	public void displayTest() {
		Menu menu=new Menu("AddressBook");
		menucrudconsoleutil.createMenuItem(menu);
		
		
	}
}

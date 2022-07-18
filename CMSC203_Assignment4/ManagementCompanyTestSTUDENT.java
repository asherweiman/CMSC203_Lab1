

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m ; 
	Property p1 ,p2,p3,p4,p5,p6;

	@Before
	public void setUp() throws Exception {
		//student create a management company
		m = new ManagementCompany("ahh","3",2,0,0,100,100);
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Almost Aspen", "Glendale", 50.00, "Sammy Smith",3,4,1,1);
		p2 = new Property ("Ambiance", "Lakewood", 40, "Tammy Taylor",1,1,2,2);
		p3 = new Property ("Bear Creek Lodge", "Peninsula", 4, "Bubba Burley",6,6,2,2);
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		p1=p2=p3=p4=p5=p6=null;
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property("A","Z",5,"dude");
		assertEquals(m.addProperty(p4),3,0);
		//student should add property with 8 args
		p5 = new Property("B","Zed",5,"dueda",10,10,5,5);
		assertEquals(m.addProperty(p5),4,0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		p6 = new Property ("chewsday", "weekand", 10, "Joey BagODonuts",30,32,2,2);
		assertEquals(m.addProperty(p6),-1,0);
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),50.00,0);

		
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),94.0,0);

	}

 }

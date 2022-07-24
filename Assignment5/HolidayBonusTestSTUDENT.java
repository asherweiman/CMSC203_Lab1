import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HolidayBonusTestSTUDENT {
	private double[][] dataSetSTUDENT = {{4,5,6},{7,3,-1},{5,8,1}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
	 */
	@Test
	public void testCalculateHolidayBonus() {
		try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT,5000,1000,2000);
			assertEquals(8000.0,result[0],.001);
			assertEquals(7000.0,result[1],.001);
			assertEquals(9000.0,result[2],.001);
		}
		catch(Exception e){
			fail("This should not have caused an Exception");
		}
		
		
		
		}
	/**
	 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonus() {
		
		assertEquals(24000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT, 5000, 1000, 2000),.001);
		
		
		
	}
	
	
	
}

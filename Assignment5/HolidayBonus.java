/**
Cmsc 203
Assignemnt 5
@author Asher Weiman
7-24-22
Eclipse
This class calculates the holiday bonus a store receives based off of a 2d array
* I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/
public class HolidayBonus {

	/**
	 * constructor
	 */
	public HolidayBonus() {}
	
	/**
	 * 
	 * @param data the 2d array with the data
	 * @param high high bonus
	 * @param low low bonus
	 * @param other default bonus 
	 * @return array of the doubles of the bonuses for each sector in that area
	 */
	public static double[] calculateHolidayBonus(double[][] data,double high,double low,double other) {
		//gets the length of the longest row 
		int hirow= 0;
		for (int i = 0; i< data.length;i++) {
				if (data[i].length > hirow) {
					hirow = data[i].length;
				}
		}
		
		
		// makes output array with the length of the rows in the data array
		double[] out = new double[data.length];
		int highestind;
		int lowestind;
		// loops through the length of the longest row
		for (int i =0; i < hirow; i++) {
			// gets the highest and lowest value's indexes from the current column 
			highestind = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data,i);
			lowestind = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,i);
			
			// loops through the output array and adds the bonus amount based off of each index
			for (int j =0; j < out.length;j++) {
				// highest value index
				if (j == highestind) {
					out[j] += high;
				}
				// lowest value index
				else if (j == lowestind) {
					out[j]+= low;
				}
				// if the row doesn't have a value for this column 
				else if (i >= data[j].length) {
					out[j] +=0;
				}
				// middle value
				else {
					out[j] += other;
				}
				
				
			}
		}
		return out;
	}
	
/**
 * 
 * @param data data the 2d array with the data
 * @param high high high bonus
 * @param low low bonus
 * @param other default bonus
 * @return array of the doubles of the bonuses for each sector totaled
 */
	public static double calculateTotalHolidayBonus(double[][] data,double high,double low,double other) {
		// gets the bonuses for each row in the data array
		double[] bonuses = HolidayBonus.calculateHolidayBonus(data,high,low,other);
		
		double total = 0;
		// adds up all the bonuses
		for (int i =0; i< bonuses.length; i++) {
			
			total += bonuses[i];
			
			
		}
		
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

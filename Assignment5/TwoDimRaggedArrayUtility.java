/**
Cmsc 203
Assignemnt 5
@author Asher Weiman
7-24-22
Eclipse
This class allows for the parsing of information from a file into a 2d ragged array.
* I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/
import java.io.*;
import java.util.Scanner;

 
public class TwoDimRaggedArrayUtility {
	/**
	 * constructor
	 */
	// constructor specified to the javadoc
	public TwoDimRaggedArrayUtility() {}
	
	/**
	 * 
	 * @param file file to be read
	 * @return array of doubles representing what was in the file
	 * @throws java.io.FileNotFoundException if file doesn't exist
	 */
	public static double[][] readFile(java.io.File file) throws java.io.FileNotFoundException{
		// declares temp array to hold strings from file
		String[][] temp = new String[10][10];
		// scaner to read the file
		Scanner readfile = new Scanner(file);
		// hold the number of rows used in the file
		int numrows = 0;
		// int to loop with for index
		int i = 0;
		// holds num o fcolumns
		int numcolumns;
		// runs until file is empty
		while (readfile.hasNextLine()) {
			// assign each row in temp to a line split at spaces
			temp[i] = readfile.nextLine().split(" ");
			// makes sure the row isn't empty then increases the number of rows
			if (temp[i][0] != null) {numrows++;}
			// increment temp index 
			i++;
		}
		
		double[][] out = new double[numrows][];
		
		i=0;
		// loop to create the columns in each row
		while (i < numrows) {
			numcolumns = 0;
			// loop to find out how long each row is and teh number of columns to add to each row
			for (int j = 0; j < temp[i].length;j++) {
				
				numcolumns++;
			}
			// creates the inner arrays and adds the equivalent temp index's value to the correct index
			out[i] = new double[numcolumns];
			for (int j = 0; j < out[i].length;j++) {
				out[i][j] = Double.parseDouble(temp[i][j]);
			}
			i++;
		}
		
		readfile.close();
		return out;
	}
	/**
	 * 
	 * @param data 2d array of data to be written to the file
	 * @param outputFile file to be written to
	 * @throws java.io.FileNotFoundException exception if the output file doesn't exist
	 */
	public static void writeToFile(double[][] data, java.io.File outputFile) throws java.io.FileNotFoundException{
		// create printwriter object to write to file
		PrintWriter out = new PrintWriter(outputFile);
		
		//loops that run for each element in the 2d ragged array
		for (int i = 0; i < data.length;i++) {
			for (int j = 0; j < data[i].length; j++) {
				// check to see that we are not at the end of a row
				if (j != data[i].length-1) {
					out.print(data[i][j] + " ");
				}
				// at the end of a row print a newline character at the end to hop to the next row
				else {
					out.print(data[i][j] + "\n");
				}
				
			}
			
		} 
		out.close();
	}
	/**
	 * 
	 * @param data 2d array to be totaled
	 * @return double representing the total of all value in the array
	 */
	public static double getTotal(double[][] data) {
		
		double total = 0;
		// loops through every element iin the 2d array and adds the value to total
		for (int i = 0; i < data.length;i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];
		
			}
		}
		return total;
	}
	
	/**
	 * 
	 * @param data 2d array to be averaged
	 * @return average of the array
	 */
	public static double getAverage(double[][] data) {
		double count= 0;
		// gets the total of the array then finds how many elements are in the array then divides total/ amt of elements
		double total = TwoDimRaggedArrayUtility.getTotal(data);
		for (int i = 0; i < data.length;i++) {
			for (int j = 0; j < data[i].length; j++) {
				count++;
		
		
			}
		}
		
		return total/count;
	}

	/**
	 * 
	 * @param data 2d array to be processed
	 * @param row index of the row that is being processed
	 * @return the total amount of the row 
	 */
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		// loops through the row at the index specified  and adds each element to the total
		for (int i = 0; i <data[row].length;i++) {
			
			total += data[row][i];
			
		}
		return total;
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param col index of the column that is being processed
	 * @return the sum of all elements in the column
	 */
	public static double getColumnTotal(double[][] data,int col) {
		double total = 0;
		// loops through the column at the index specified  and adds each element to the total
		for (int i = 0; i < data.length;i++) {
			// makes sure that the col index is in that row's array
			if (data[i].length > col) {
				total += data[i][col];
			}	
		}
		return total;
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param row index of the row that is being processed
	 * @return the highest value in the row
	 */
	public static double getHighestInRow(double[][] data,int row) {
		// create default highest value
		double highest = data[row][0];
		//loops through row and replaces highest if the indexed element is higher
		for (int i = 0; i <data[row].length;i++) {
			
			if (data[row][i] > highest) {
				highest = data[row][i];
			}
			
		}
		
		return highest;
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param row index of the row that is being processed
	 * @return index of highest value in row
	 */
	public static int getHighestInRowIndex(double[][] data,int row) {
		double highest = data[row][0];
		int index =0;
		// same as getHighestrow value method but keeps track of the index as well
		for (int i = 0; i <data[row].length;i++) {
			
			if (data[row][i] > highest) {
				highest = data[row][i];
				index = i;
			}
			
		}
		
		return index;
	}
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param row index of the row that is being processed
	 * @return  index of lowest value in row
	 */
	public static int getLowestInRowIndex(double[][] data,int row) {
		double lowest = data[row][0];
		int index =0;
		//loops through row and replaces lowest if the indexed element is lower
		for (int i = 0; i <data[row].length;i++) {
			
			if (data[row][i] < lowest) {
				lowest = data[row][i];
				index = i;
			}
			
		}
		
		return index;
		
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param row index of the row that is being processed
	 * @return  lowest value in row
	 */
	public static double getLowestInRow(double[][] data,int row) {
		// uses the index from the getLowestInRowIndex method and the inputted row to find the lowest 
		return data[row][TwoDimRaggedArrayUtility.getLowestInRowIndex(data, row)];
		
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param col index of the column that is being processed
	 * @return index of highest value in column
	 */
	 
	public static int getHighestInColumnIndex(double[][] data,int col) {
		// keep trakc of index, highest value, whether the highest and index have been assigned a value from the array
		int index = 0;
		double highest =0;
		boolean flag = false;
		//runs through each row and checks each element at the column index (if the array is long enough to support that index)
		for (int i =0; i < data.length;i++) {
			
			if (data[i].length > col) {
				// check to see if  highest and index have been assigned a value from the array then initializes them
				if (flag == false) {
					flag = true;
					highest = data[i][col];
					index = i;
				} else {
					// replaces highest and index if a higher element is found
					if (data[i][col] > highest) {
						
						highest = data[i][col];
						index = i;
					}
				}
			}
		}
		
		return index;
		
	}
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param col index of the column that is being processed
	 * @return highest value in column
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		// uses the index from the getHighestInColumnIndex method and the inputted col to find the highest 
		return data[TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col)][col];
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param col index of the column that is being processed
	 * @return index of lowest value in column
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		// this works the same as getHighestInColumnIndex method except it searches for the lowest instead 
		int index = 0;
		double lowest =0;
		boolean flag = false;
		for (int i =0; i < data.length;i++) {
			
			if (data[i].length > col) {
				
				if (flag == false) {
					flag = true;
					lowest = data[i][col];
					index = i;
				} else {
					
					if (data[i][col] < lowest) {
						
						lowest = data[i][col];
						index = i;
					}
				}
				
			}
		}
		
		return index;
		
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @param col  index of the column that is being processed
	 * @return lowest value in column
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		// uses the index from the getLowestInColumnIndex method and the inputted col to find the lowest 
		
		return data[TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col)][col];
		
	}
	
	/**
	 * 
	 * @param data 2d array to be processed
	 * @return gets the highest value in the array
	 */
	public static double getHighestInArray(double[][] data) {
		// sets default highest to highest in the first row
		double highest = TwoDimRaggedArrayUtility.getHighestInRow(data,0);
		// loops through each row in the array
		for (int i =0; i < data.length; i++) {
			// replaces the highest value if a higher element in a row is found
			if (TwoDimRaggedArrayUtility.getHighestInRow(data,i) > highest) {
				highest = TwoDimRaggedArrayUtility.getHighestInRow(data,i);
			} 
			
		}
		
		return highest;
		
	}
	/**
	 * 
	 * @param data 2d array to be processed
	 * @return gets the lowest value in the array
	 */
	public static double getLowestInArray(double[][] data) {
		// same as getHighestInArray method except it searches for the lowest value so this uses the lowest methods instead
		double lowest = TwoDimRaggedArrayUtility.getLowestInRow(data,0);
		
		for (int i =0; i < data.length; i++) {
			
			if (TwoDimRaggedArrayUtility.getLowestInRow(data,i) < lowest) {
				lowest = TwoDimRaggedArrayUtility.getLowestInRow(data,i);
			} 
			
		}
		
		return lowest;
		
	}

}

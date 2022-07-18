/*
 * Class: CMSC203 
 * Instructor: Prof. Grigoriy Grinberg 
 * Description: Simulates a realestate managemet company
 * Due: 7/17/2022
  * Assignment 4
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/


import javafx.scene.layout.Region;
/**
 * simulates a realaestate management company which holds different properties 
 * 
 * @author asher
 *
 */


public class ManagementCompany extends java.lang.Object{
	/**
	 * holds name of company 
	 */
	private String name;
	/**
	 * holds taxID of company 
	 */
	private String taxID;
	/**
	 * holds properties of the company 
	 */
	private Property[] properties;
	/**
	 * holds mgmFeePer per property 
	 */
	private double mgmFeePer;
	/**
	 * holds max amount of properties the co can hold 
	 */
	private final int MAX_PROPERTY = 5;
	/**
	 * holds the max width per plot for properties 
	 */
	private final int MGMT_WIDTH = 10;
	/**
	 * holds the max depth per plot for properties 
	 */
	private final int MGMT_DEPTH = 10;
	/**
	 * holds the plot width for management co 
	 */
	private Plot plot;
	
	//constructors 
	/**
	 * makes ManagementCompany with empty strings and default plot and initializes properties array
	 */
	public ManagementCompany() {
		
		name = "";
		taxID = "";
		plot = new Plot(0,0,10,10);
		properties = new Property[MAX_PROPERTY];
	}
	/**
	 * makes ManagementCompany with name and taxID strings, and management fee and default plot and initializes properties array
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * 
	 * 
	 */
	ManagementCompany(String name, String taxID, double mgmFee) {
		
		//sets values to this specific object
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee; 
		
		plot = new Plot(0,0,10,10);
		properties = new Property[MAX_PROPERTY];
		
	}

	/**
	 * makes ManagementCompany with name and taxID strings, and management fee and plot with inputted parametres and initializes properties array
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name,String taxID,double mgmFee,int x,int y,int width,int depth) {
		
		//sets values to this specific object
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee; 
		
		plot = new Plot(x,y,width,depth);
		properties = new Property[MAX_PROPERTY];
		
		
	}
	/**
	 * copies values from another company object into this one
	 * @param otherCompany
	 */
	public ManagementCompany(ManagementCompany otherCompany) {
		//sets values to this specific object
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
		
	}
	/**
	 * 
	 * @return MAX_PROPERTY field
	 */
	public int getMAX_PROPERTY() {
		
		return MAX_PROPERTY;
	}
	/**
	 * adds a property to the properties array
	 * @param property
	 * @return either -1 if the array is full, -2 if property is null, -3 if the plot is not contained by the MgmtCo plot, -4 of the plot overlaps any other property, or the index in the array where the property was added successfully.
	 */
	public int addProperty(Property property) {
		
		int out = 0;
		//check if the param property is a null value
		if (property == null) {return -2;}
		// checks to see if the porperties array is full 
		if (properties[4] != null) {return -1;}
		// checks to see if this plot encompasses the inputted one
		if (plot.encompasses(property.getPlot()) == false) {return -3;}
		// loop through properties array
		for (int i=0; i< properties.length; i++) {
			// find an empty spot to insert new property
			if (properties[i] == null) {
				//inserts property to index
				properties[i] = property;
				//returns the index where it was inserted
				out = i;
				return out;
				// if there is a property already there checks to make sure the new one to be inserted doesn't overlap
			} else if (property.getPlot().overlaps(properties[i].getPlot()) == true) {
				return -4;
				}
			
		}
		return out;
	}
/**
 * creates new property object from params and adds it to the properties array
 * @param name
 * @param city
 * @param rent
 * @param owner
 * @return either -1 if the array is full, -2 if property is null, -3 if the plot is not contained by the MgmtCo plot, -4 of the plot overlaps any other property, or the index in the array where the property was added successfully.

 */
	public int addProperty(String name,String city,double rent,String owner) {
		// creates new property object out of params
		Property property = new Property(name,city,rent,owner);
		//same as first addProperty
		int out = 0;
		if (property == null) {return -2;}
		if (properties[4] != null) {return -1;}
		
		if (plot.encompasses(property.getPlot()) == false) {return -3;}
		
		for (int i=0; i< properties.length; i++) {
			
			if (properties[i] == null) {
				
				properties[i] = property;
				out = i;
				return out;
			} else if (property.getPlot().overlaps(properties[i].getPlot()) == true) {
				return -4;
				}
			
		}
		return out;
	}
	/**
	 * creates new property object from params and adds it to the properties array
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return either -1 if the array is full, -2 if property is null, -3 if the plot is not contained by the MgmtCo plot, -4 of the plot overlaps any other property, or the index in the array where the property was added successfully.
	 */
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		// creates new property object out of params
		Property property = new Property(name,city,rent,owner,x, y, width, depth);
		//same as first addProperty
		int out = 0;
		if (property == null) {return -2;}
		if (properties[4] != null) {return -1;}
		
		if (plot.encompasses(property.getPlot()) == false) {return -3;}
		
		for (int i=0; i< properties.length; i++) {
			
			if (properties[i] == null) {
				
				properties[i] = property;
				out = i;
				return out;
			} else if (property.getPlot().overlaps(properties[i].getPlot()) == true) {
				return -4;
				}
			
		}
		return out;
	}
	
/**
 * gets rent from all of the properties
 * @return totalrent from all properties
 */
	public double totalRent(){
		//makes output var
		double total = 0;
		//loop through properties array
		for (int i = 0; i < properties.length ; i++) {
			// makes sure the element at index isn't null
			if (properties[i] != null) {
				//adds this index's property's rent ot the total
				total += properties[i].getRentAmount();
				}
		}
		return total;
	}
	/**
	 * gets the max property rent
	 * @return the max property rent
	 */
	public double maxRentProp() {
		// gets index of the max property from the maxRentPropertyIndex method then gets the rent from that property
		// and returns it
		double out = properties[this.maxRentPropertyIndex()].getRentAmount();
		
		return out;
	}

	/**
	 * gets the location of the max rent from within the properties array
	 * @return where in the properties array the max is 
	 */
	private int maxRentPropertyIndex() {
		 // sets output index at 0
		int out = 0;
		// sets max rent var to the first property in the list's rent
		double max = properties[0].getRentAmount();
		// loop through properties array
		for (int i = 0; i < properties.length ; i++) {
			// makes sure the element at index isn't null and the index's rent is greater than the max rent
			if (properties[i] != null && properties[i].getRentAmount() > max) {
				//sets max to the newly discovered max rent
				max = properties[i].getRentAmount();
				// sets index to this elements ( the current max's)
				out = i;
			}
			
			
			
		}
		return out;
		
	}
	/**
	 * gets the string representation of the property at the specified index
	 * @param i
	 * @return string of the property at the index
	 */
	private String displayPropertyAtIndex(int i) {
		// returns the property object at the index as a string
		return properties[i].toString();
		
		
	}
	/**
	 * represents the company into a string format
	 * @return compant in string format
	 */
	public String toString() {
		// breaks the string into parts with the right variables inserted as specified in the instructions
		String top = "  List of the properties for "+name+", taxID: "+taxID+"\n";
		String breaker = "  ______________________________________________________\n";
		String manfee = " total management Fee: "+(mgmFeePer/100)*this.totalRent()+"\n";
		
		String body = "";
		//loop to add the string version of all the properties in the properties array to the body string
		for (int i = 0; i< properties.length;i++) {
			if (properties[i] != null) {
				
				body += properties[i].toString();
				
				
			}
		}
		// combines string as formatted in the instructions
		return top + breaker+body+"\n"+breaker+manfee;
		
	}
	/**
	 * gets the company's plot
	 * @return the company's plot
	 */
	public Plot getPlot() {
		return plot;
	}
	/**
	 * gets the company's name
	 * @return the company's name
	 */
	public String getName() {
		return name;
	}
	

	
}

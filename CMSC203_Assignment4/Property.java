/*
 * Class: CMSC203 
 * Instructor: Prof. Grigoriy Grinberg 
 * Description: represents a property with owner and location as well as dimensions
 * Due: 7/17/2022
 * Assignment 4
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/


/**
 * represents a property with owner and location as well as dimensions
 * @author asher
 *
 */
public class Property extends java.lang.Object{
	/**
	 * holds property's city's name
	 */
	private String city;
	/**
	 * holds property's owner's name
	 */
	private String owner;
	/**
	 * holds property's  name
	 */
	private String propertyName;
	/**
	 * holds property's rent
	 */
	private double rentAmount;
	/**
	 * holds property's plot
	 */
	private Plot plot;
	
	
	//constructors
	/**
	 * creates default property 
	 */
	public Property() {
		city= "";
		owner= "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot(0,0,1,1);
		
		
	}
	/**
	 *  copies another property's values to this one
	 * @param p property to be copied
	 */
	public Property(Property p) {
		//sets values to this specific object
		city = p.city;
		owner = p.owner;
		propertyName = p.propertyName;
		rentAmount  = p.rentAmount;
		//makes new plot object with parm's specifics
		plot = new Plot(p.plot.getX(),p.plot.getY(),p.plot.getWidth(),p.plot.getDepth()) ;
	}
	/**
	 * assingns param values to this property's
	 * @param propertyName name of property
	 * @param city name of city
	 * @param rentAmount amount of rent
	 * @param owner name of property's owner
	 */
	public Property(String propertyName,String city,double rentAmount, String owner) {
		//sets values to this specific object
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount  = rentAmount;
		plot = new Plot(0,0,1,1);
	}
	/**
	 * Assigns param values to this property's
	 * @param propertyName name of property
	 * @param city name of city
	 * @param rentAmount amount of rent
	 * @param owner name of property's owner
	 * @param x property's plot's x value
	 * @param y property's plot's y value
	 * @param width property's plot's width value
	 * @param depth property's plot's depth value
	 */
	public Property(String propertyName,String city,double rentAmount, String owner,int x,int y,int width,int depth) {
		//sets values to this specific object
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount  = rentAmount;
		plot = new Plot(x,y,width,depth);
	}
	/**
	 * gets name of property
	 * @return name of property
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * sets name of property
	 * @param propertyName name of property
	 */
	public void setPropertyName(String propertyName) {
		//sets specific object's value to inputted param
		this.propertyName = propertyName;
	}
	/**
	 * gets name of city
	 * @return name of city
	 */
	public String getCity() {
		return city;
		}
	/**
	 * sets name of property's city
	 * @param city name of property's city
	 */
	public void setCity(String city) {
		//sets specific object's value to inputted param
		this.city = city;
	}
	/**
	 * gets  property plot
	 * @return  property plot
	 */
	public Plot getPlot() {
		return plot;
	}
	/**
	 * sets new plot for property
	 * @param x property's plot's new x
	 * @param y property's plot's new y
	 * @param width property's plot's new width
	 * @param depth property's plot's new depth
	 */
	public void setPlot(int x, int y, int width, int depth) {
		//sets specific object's value to inputted param
		this.plot = new Plot(x,y,width,depth);
	}
	/**
	 * gets rent of property
	 * @return rent of property
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	/**
	 * sets rent of property
	 * @param rentAmount amount property costs to rent
	 */
	public void setRentAmount(double rentAmount) {
		//sets specific object's value to inputted param
		this.rentAmount = rentAmount;
	}
	/**
	 * gets name of property's owner
	 * @return name of property'owner 
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * sets name of property's owner
	 * @param owner name of property's owner
	 */
	public void setOwner(String owner) {
		//sets specific object's value to inputted param
		this.owner = owner;
		
	}
	/**
	 * creates string representation of property object
	 * @return string representation of property object
	 */
	public String toString(){
		//returns concatenated string specific to the instructions
		return "Property Name: "+propertyName+"\nLocated in "+city+"\nBelonging to: "+ owner+"\nRent Amount: "+rentAmount+" \n"; 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

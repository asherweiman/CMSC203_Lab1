/*
 * Class: CMSC203 
 * Instructor: Prof. Grigoriy Grinberg 
 * Description: represents a plot of land
 * Due: 7/17/2022
 * Assignment 4
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/

/**
 * simulates a plot of land on coord grid
 * @author asher
 *
 */

public class Plot extends java.lang.Object{
	/**
	 * holds plot's x value
	 */
	private int x;
	/**
	 * holds plot's y value
	 */
	private int y;
	/**
	 * holds plot's width value
	 */
	private int width;
	/**
	 * holds plot's depth value
	 */
	private int depth;
	//constructors 
	/**
	 * creates a default plot
	 */
	public Plot() {
		 x=0; 
		 y=0; 
		 width=1; 
		 depth=1;
	}
	/**
	 * copies parameter pot
	 * @param p
	 */
	public Plot(Plot p) {
		
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	/**
	 * creates specific plot to the entered params
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	/**
	 * checks to see if two plots overlap
	 * @param p plot to compare to
	 * @return boolean true if overlap false if no overlap
	 */
	public boolean overlaps(Plot p) {
		// default is set to true
		boolean flag = true;
		//gets top right points of rectangles 
		int rx = x+width;
		int ry = y+depth;
		int rpx = p.x+p.width;
		int rpy = p.y+p.depth;
		// sees if one of the plots is too far left of the other 
		if (x >= rpx || p.x >= rx) {
			flag = false;
			}
		// checks to see if y value is inside of the other plot's y values 
		//by comparing if left is lower than other's left and right is higher than other's right
		if ((ry <= p.y && rpy >= y)|| (ry >= p.y && rpy <= y)) {
				flag = false;
				}
		
		return flag;
		
		
	}
	/**
	 * check to see if this plot encompasses the entered one
	 * @param p plot to compare to
	 * @return boolean true if encompass false if no encompass
	 */
	public boolean encompasses(Plot p) {
		boolean flag = false;
		//gets top right points of rectangles 
		int rx = x+width;
		int ry = y+depth;
		int rpx = p.x+p.width;
		int rpy = p.y+p.depth;
		//sees if the p plot's  left and right points are inside of this plot's
		if ((x <= p.x && y<= p.y) && (rx >= rpx && ry >= rpy)) {
			flag = true;
		}
		
		return flag;
	}
	/**
	 * gets plot's x value
	 * @return plot's x value
	 */
	public int getX() {
		return x;
	}
	/**
	 * sets the plot's x coord
	 * @param x plot's x coord
	 */
	public void setX(int x) {
		//sets values to this specific object
		this.x = x;
	}
	/**
	 * gets plot's y value
	 * @return plot's y value
	 */
	public int getY() {
		return y;
	}
	/**
	 * sets the plot's y coord
	 * @param y plot's y coord
	 */
	public void setY(int y) {
		//sets values to this specific object
		this.y = y;
	}
	/**
	 * gets plot's width value
	 * @return plot's width value
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * sets the plot's width coord
	 * @param width plot's width coord
	 */
	public void setWidth(int width){
		//sets values to this specific object
		this.width = width;
	}
	/**
	 * gets plot's depth value
	 * @return plot's depth value
	 */
	public int getDepth() {
		return depth;
	}
	/**
	 * sets the plot's depth coord
	 * @param depth plot's depth coord
	 */
	public void setDepth(int depth){
		//sets values to this specific object
		this.depth = depth;
	}
	/**
	 * creates string represntation of plot object
	 * @return returns string object represntation of plot object
	 */
	public String toString(){
		// concatenates string together like the instructions specify
		return "Upper left: ("+x+","+y+"); Width: "+width+" Depth: "+depth;
		
		
	}
	
	
}

/*
 * Class: CMSC203 
 * Instructor: Prof. Grigoriy Grinberg 
 * Description:A program that creates a movie class object and asks the user for the title, rating, 
 * and # of tickets sold and assigns these as attributes for the movie class
 * Due: 7/03/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/




//gets the scanner class from util library
import java.util.Scanner;



//declares the MovieDriver class
public class MovieDriver {

	public static void main(String[] args) {
		// creates new scanner object
		Scanner stdin = new Scanner(System.in);
		//creates film object
		Movie film = new Movie();
		
			//prints msg to get name of movie from user and gets user input
			System.out.println("Enter the name of a movie");
			film.setTitle(stdin.nextLine());
			//prints msg to get rating of movie from user and gets user input
			System.out.println("Enter the rating of the movie");
			film.setRating(stdin.nextLine());
			//prints msg to get number of tickets sold for this movie from user and gets user input
			System.out.println("Enter the number of tickets sold for this movie");
			film.setSoldTickets(stdin.nextInt());
			//creates string variable to hold the string representation of the film object
			String film_str = film.toString();
			// pritns the string representation
			System.out.println(film_str);
			//checks if user wants to continue in the loop
			System.out.println("Do you want to enter another? (y or n)");
			
			// resets so the next stdin.nextline() doesn't take in any previous "\n"'s
			stdin.nextLine();
		
		//prints goodbye 
		System.out.println("Goodbye");
		//closes the scanner object
		stdin.close();
		
	}

}

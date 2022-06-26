/*
 * Class: CMSC203 
 * Instructor: Prof. Grigoriy Grinberg 
 * Description: A game where the user tries to guess a computer generated random number
 * Due: 7/03/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Asher Weiman
*/





//gets the scanner class from util library
import java.util.Scanner;


//declares the RandomNumberGuesser class
public class RandomNumberGuesser {

	// declares main method with a void return value 
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int randNum = RNG.rand();
		int lowGuess = 0;
		int highGuess = 100;
		int nextGuess = 0;
		boolean start = true;
		String cont = "";
		while (cont.equals("no") == false) {
			if (start == true) {
				randNum = RNG.rand();
				lowGuess = 0;
				highGuess = 100;
				System.out.println("Enter your first guess");
				nextGuess = stdin.nextInt();
				start  = false;
			}
			stdin.nextLine();
			if (RNG.inputValidation(nextGuess, lowGuess, highGuess) == true) {
				
				System.out.println("Number of guesses is " + RNG.getCount());
				
				if (nextGuess == randNum) {
					System.out.println("Congratulations, you guessed correctly");
					System.out.println("Try again? (yes or no)");
					cont = stdin.nextLine();
					start = true;
					RNG.resetCount();
				}
				else{
					if (nextGuess > randNum) {
						System.out.println("Your guess is too high");
						highGuess = nextGuess;
						
					}
					else if (nextGuess < randNum) {
						System.out.println("Your guess is too low");
						lowGuess = nextGuess;
					}
					System.out.println("Enter your next guess between " + lowGuess+" and "+ highGuess);
					nextGuess = stdin.nextInt();
				}
			}
			else {
				
				nextGuess = stdin.nextInt();
				
			}
		
		
		}
		System.out.println("Thanks for playing...");
		stdin.close();
	}

}

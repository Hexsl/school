import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessingGame
{
	public static void main(String[] args) {
	    // Initialization of scanner object for user input through a CLI.
		Scanner scan = new Scanner(System.in);
		
		// Initialization of an object that creates "random" numbers.
		Random rand = new Random();
		
		// Generate some integer between 1 and 10.
		int randomNum = rand.nextInt(1, 11);
		int guess;
		final int guessLim = 5;
		int count = 0;
		
		// Greet the user.
		System.out.println("Hello!");
		
		// Get user input for guesses.
		while (count < guessLim) {
		    try {
		        System.out.print("Please guess an integer between 1 and 10: ");
		        guess = scan.nextInt();
		    } catch (InputMismatchException e) {
		        System.out.println("Input must be an integer.");
		        break;
		    }
		    
		    // Check the user input and respond accordingly.
		    if (guess > 10 || guess < 1) {
		        System.out.println("The number you gave is out of range.");
		    } else if (guess > randomNum) {
		        System.out.println("That number is too high! Try again.");
		    } else if (guess < randomNum) {
		        System.out.println("That number is too low! Try again.");
		    } else {
		        System.out.println("You got it! Congratulations!");
		        break;
		    }
		    
		    // Iterate.
		    count++;
		}
		
		// Tell the user if they've made too many guesses.
		if (count == guessLim) 
		    System.out.println("\nSorry, you're out of guesses.");
		
		System.out.println("The correct number was " + randomNum + ".");
		
		// Close scanner object.
		scan.close();
	}
}

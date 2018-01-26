import java.util.Scanner;
import java.util.Random; //utilized java's Random method

public class DiceRolling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner for input
		String cont = "y";
		
		System.out.println("Welcome to the Grand Circus Casino!"); //prompt for input
		System.out.println("Please enter the number of sides you would like each die to have: ");
		int numOne = input.nextInt();
		
		while (cont.equalsIgnoreCase("y")) { //while loop so that program only runs as long as user wants to continue
			System.out.println("You rolled: " + (die1(numOne)) + " and " + (die2(numOne))); //calling the methods i used back to main
			System.out.println("Roll again? (y/n): ");
			cont = input.next();
		}
		System.out.println("Thanks for playing. Goodbye!"); //officially end program
	}
	
	public static int die1(int numOne) { //one method to get the roll of the first die
		Random random = new Random(); 
        numOne = random.nextInt(numOne) + 1;
        return numOne;	
	}
	
	public static int die2(int numOne) {//another method to get the roll of the second die
		Random random = new Random(); 
        numOne = random.nextInt(numOne) + 1;
        return numOne;
	}
		
	


}
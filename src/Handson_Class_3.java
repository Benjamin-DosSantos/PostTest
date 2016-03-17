/**
 * @Author: Benjamin DosSantos
 * Description: This application displays
 * the numbers 30 to 20 in console.
 *
 **/

public class Handson_Class_3 {
	public static void main(String[] args){
		int starting_number = 30;	// Sets the number to start the while loop
		int ending_number = 20;		// Sets the number to end the while loop at
		while(starting_number > ending_number){		
			System.out.println(starting_number);	// Prints the value of starting number
			starting_number--;	// Subtracts one from the starting value
		}// End of while loop
		System.out.println(starting_number);	// Prints the final value of the starting_number
	}// End of main method
}// End of class

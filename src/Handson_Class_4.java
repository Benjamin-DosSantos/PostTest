/**
 * @Author: Benjamin DosSantos
 * Description: This application prints
 * the numbers 100 to 20 by 10s to console
 *
 **/

public class Handson_Class_4 {
	public static void main(String[] args){
		int starting_number = 100;	// Sets the starting number for the while loop to start at
		int ending_number = 20;	// Sets the ending number for the while loop to end at 
		while(starting_number > ending_number){	
			System.out.println(starting_number);	// Prints the value of the starting_number to the console
			starting_number -= 10;
		}// End of for loop
		System.out.println(starting_number);	// Prints the value of the final starting_number to the console
	}// End of main method
}// End of class

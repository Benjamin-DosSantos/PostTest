import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

/**
 * 
 * @Author Benjamin DosSantos
 * Description: This applet draws 100 ovals (0 - 99)
 * of a random width and height on the applet view in random positions
 *
 **/

public class Handson_Class_7 extends Applet{
	public void init(){
		int x_size = 1000, y_size = 1000;	// Sets the x and y size of the applet
		this.setSize(x_size, y_size);	// Sets the size of the applet to the values of the x and y_size integers
	}// End of init method
	
	public void paint(Graphics g){	
		Random ran = new Random();	// Main random call
		
		int oval_amount = 100;	// Sets the amount of ovalangles to be generated
		int oval_width_max = 20;
		int oval_height_max = 20;
		int oval_min_width = 10;
		int oval_min_height = 10;
		
		for(int i = 0; i < oval_amount; i++){	
			int oval_x_pos = ran.nextInt(1000);		// Sets the x position to a random from 0 - 1000
			int oval_y_pos = ran.nextInt(1000);		// Sets the y position to a random from 0 - 1000
			int oval_x_size = ran.nextInt(oval_width_max - oval_min_width) + oval_min_width;	// Sets the width to a random value between the max and minimum width variables
			int oval_y_size = ran.nextInt(oval_height_max - oval_min_height) + oval_min_height;	// Sets the height to a random value between the max and minimum height variables
			g.drawOval(oval_x_pos, oval_y_pos, oval_x_size, oval_y_size);	// Draws the oval at the x,y position with a set width and height 
			System.out.println(i);	// Debug print out of the count of oval.
		}// End of for loop
	}// End of paint method
}// End of class

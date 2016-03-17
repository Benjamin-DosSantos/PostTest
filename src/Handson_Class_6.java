import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

/**
 * 
 * @Author Benjamin DosSantos
 * Description: This applet draws 100 rectangles (0 - 99)
 * of a random width and height on the applet view in random positions
 *
 **/

public class Handson_Class_6 extends Applet{
	public void init(){
		int x_size = 1000, y_size = 1000;	// Sets the x and y size of the applet
		this.setSize(x_size, y_size);	// Sets the size of the applet to the values of the x and y_size integers
	}// End of init method
	
	public void paint(Graphics g){	
		Random ran = new Random();	// Main random call
		
		int rect_amount = 100;	// Sets the amount of rectangles to be generated
		int rect_width_max = 200;
		int rect_height_max = 200;
		
		for(int i = 0; i < rect_amount; i++){	
			int rect_x_pos = ran.nextInt(1000);		// Sets the x position to a random from 0 - 1000
			int rect_y_pos = ran.nextInt(1000);		// Sets the y position to a random from 0 - 1000
			int rect_x_size = ran.nextInt(rect_width_max);	
			int rect_y_size = ran.nextInt(rect_height_max);	
			g.drawRect(rect_x_pos, rect_y_pos, rect_x_size, rect_y_size);	// Draws the rectangle at the x,y position with a set width and height 
			System.out.println(i);	// Debug print out of the count of rectangles.
		}// End of for loop
	}// End of paint method
}// End of class

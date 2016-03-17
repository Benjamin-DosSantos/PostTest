import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

/**
 * 
 * @Author Benjamin DosSantos
 * Description: This applet draws 100 ovals (0 - 99)
 * of the same size and color on the applet view in random positions
 *
 **/

public class Handson_Class_5 extends Applet{
	public void init(){
		int x_size = 1000, y_size = 1000;	// Sets the x and y size of the applet
		this.setSize(x_size, y_size);	// Sets the size of the applet to the values of the x and y_size integers
	}// End of init method
	
	public void paint(Graphics g){	
		Random ran = new Random();	// Main random call
		
		int oval_amount = 100;	// Sets the amount of ovals to be generated
		
		for(int i = 0; i < oval_amount; i++){	
			int oval_x_pos = ran.nextInt(1000);		// Sets the x position to a random from 0 - 1000
			int oval_y_pos = ran.nextInt(1000);		// Sets the y position to a random from 0 - 1000
			int oval_x_size = 20;	// Sets the x size of the oval 
			int oval_y_size = oval_x_size;	// Sets the y size to equal the x size
			g.drawOval(oval_x_pos, oval_y_pos, oval_x_size, oval_y_size);	// Draws the oval at the x,y position with a set width and height 
			System.out.println(i);	// Debug print out of the count of ovals.
		}// End of for loop
	}// End of paint method
}// End of class

package level0_B;
import javax.swing.JOptionPane;
import java.awt.Color;

import org.teachingextensions.approvals.lite.reporters.windows.TortoiseDiffReporter;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Turtle {
	public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
	

		//3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog(null, "what is your favorite color?");
		Tortoise.setSpeed(10);
		//4. use an if/else statement to set the pen color that the user requested
       if (color .equalsIgnoreCase("green"))
       {
    	   		Tortoise.setPenColor(Color.green);
    	for (int j = 0; j < 100000; j++) {
		 
		    Tortoise.turn(5 + j);
		    Tortoise.move(5);
    			}

	}
}
	}
}
	       

	

	   		
       //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
	//1. make the tortoise draw a shape (this will take more than one line of code)


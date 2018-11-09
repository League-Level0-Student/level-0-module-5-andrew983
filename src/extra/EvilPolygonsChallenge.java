package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot dos = new Robot();
		//2. Set the spedos.set\\ed to 100
dos.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "what color?", "despacito", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"broun","grean", "rhead"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			dos.penDown();
dos.setPenColor(139,69,19);		}
		if (colorChoice == 1) {
			dos.penDown();
dos.setPenColor(0,128,0);		}
		if (colorChoice == 2) {
			dos.penDown();
dos.setPenColor(255,0,0);		}
		}	//4. Ask the use how many polygons they want to be drawn.
		String ree = JOptionPane.showInputDialog("how many shapes do you want drtawn mate?");
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}


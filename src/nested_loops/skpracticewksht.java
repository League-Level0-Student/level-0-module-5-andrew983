package nested_loops;

import javax.swing.JOptionPane;
import java.util.Random;

public class skpracticewksht {

	public static void main(String[] args) {

		skpracticewksht skills = new skpracticewksht();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have");
		int dime = Integer.parseInt(dimes);

		// Tell them how many cents they have (hint multiply by 10)

		JOptionPane.showMessageDialog(null, "You have" + " " + dime * 10 + " " + "cents.");

		// Ask the user how tall they are (inches)

		String hights = JOptionPane.showInputDialog("How tall are you in INCHES (feet*12)");
		int height = Integer.parseInt(hights);

		// If they are shorter than 36 inches, tell them to eat their Wheaties

		if (height < 36)
			;
		{
			JOptionPane.showMessageDialog(null, "Eat your wheaties!");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 1; i < 10; i++) {

			System.out.println(i * 3);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the con sole
		Random gen = new Random();
		int Aa = gen.nextInt(20) + 1;

		// Get another random number that is less than 10 and print it to the console
		int Bb = gen.nextInt(10) + 1;

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, "Difference is " + (Aa - Bb));
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
String city = JOptionPane.showInputDialog("What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City

	if(city .equals ("San Diego")) {
JOptionPane.showMessageDialog(null, "You live in America's Finest Çi†¥");
	}
		// Otherwise, tell them to move to San Diego
	else {
		JOptionPane.showInputDialog("Move to San Diego!");
	}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
int cars = 2;
if(cars == 1) {
	JOptionPane.showMessageDialog(null, "2012 Honda Odessey");	
}
else if(cars == 0) {
	JOptionPane.showMessageDialog(null, "Bet yopu use public transportation");	
}
		// If there is 1 car, use a pop-up to display the make/model of the car
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
else if(cars == 2) {
	JOptionPane.showMessageDialog(null, cars*4 +" Wheels");	
}

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
String school = JOptionPane.showInputDialog("What is the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
JOptionPane.showMessageDialog(null, school + " is a fantastic school!");



	}

}

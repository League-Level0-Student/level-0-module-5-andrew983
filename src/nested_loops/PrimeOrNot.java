package nested_loops;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {

	String a =JOptionPane.showInputDialog("what number want to be primeified?!/1/?!one?");
	int x = Integer.parseInt(a);
			for(int i=2; i<x; i++) {
	if(x%i == 0) {
	
	System.out.println("not prime!");
	System.exit(0);
	}
	
	 }
	System.out.println("prime!");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

package nested_loops;

public class Fibonacchi {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		int c = 0;	
				
				
		for (int i = 0; i <= 10;i++) {
		//while(c<144) {
		c= a+b;
		a=b;
		b=c;
	System.out.println(c);
		}
	}
}

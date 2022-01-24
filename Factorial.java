package week1.day2.assignments;

public class Factorial {
	
	public static void main(String[] args) {
		
		int input = 5, fact = 1;
		
		for(int i=1; i <= input; i++) {
			
			fact = fact * i;
		}
		
		System.out.println("The Factorial of a "+input+":\t"+fact );
	}

}

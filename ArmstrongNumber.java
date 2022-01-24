package week1.day2.assignments;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int input = 153, original, remainder, calculated = 0;
		
		System.out.println("Input Value:\t"+input);

        original = input;

        while (original != 0)
        {
            remainder = original % 10;
            calculated = calculated + remainder*remainder*remainder;
            original /= 10;
        }
        
        if(input == calculated) {
            System.out.println(input + " is an Armstrong number.");
        }
        else {
            System.out.println(input + " is not an Armstrong number.");
        }
	}

}

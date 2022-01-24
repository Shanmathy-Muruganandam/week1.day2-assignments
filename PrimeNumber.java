package week1.day2.assignments;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input = 26;
		System.out.println("Input value: "+input);
		boolean flag = false;
		for(int i=2; i<=input/2; i++) {
			if(input % i ==0) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		if(flag == false) {
			System.out.println("The Number "+input+ " is Prime Number");
		}
		else {
			System.out.println("The Number "+input+ " is non Prime Number");
		}
	}

}

package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		 int input = 371;
		 int sum =0;
		 
		 int originalinput = input;
		 
		 while(input>0) {
			 
			 int rem = input % 10;
			 sum = sum +(rem*rem*rem);
			 input = input/10;
			 			 
			 
		 }
 if (sum == originalinput) {
	 System.out.println("given number is amstrong");
 }
 else {
	 System.out.println("not amstrong");
 }
	}

}

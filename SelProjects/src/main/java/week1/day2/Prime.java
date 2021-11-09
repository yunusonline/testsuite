package week1.day2;

public class Prime {

	public static void main(String[] args) {
		int input = 11;
		int count = 0;
				
		//for some reason this code not woring??
		for (int i = 1 ; i<=input; i++)
		{
			if (input % i == 0 ); {
				count = count + 1 ;
			}
			
			
		}
			if(count == 1) {
         System.out.println("Given number is prme");
          
			}
			else 
			{
				System.out.println("not prime");
				
			}
	}
	
}





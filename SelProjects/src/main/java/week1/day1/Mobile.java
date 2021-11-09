package week1.day1;

public class Mobile {
	String phoneColor = "Blue";
	String phoneBrand="OPPO";
	double phoneSize = 6.6;
	boolean isSmartPhone = true; 
	double phoneNumber = 9094019404D;
	String modelNumbr = "RENO 5PRO 5G";
	
	public void sendSMS() {
		System.out.println("message sent");
		
	}
	public void makeCall() {
		System.out.println("call connected");
		
	}
 
	public void dialCall() {
		System.out.println("dialing");
		
	}
	
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendSMS();
		obj.makeCall();
		System.out.println(obj.phoneColor);
		 
		String brand = obj.phoneBrand;
		System.out.println(brand);
		
		double phsize = obj.phoneSize;
		System.out.println(phsize);
		
		boolean ismart = obj.isSmartPhone;
		System.out.println(ismart);
		
		obj.dialCall();
		
		double phnmbr = obj.phoneNumber;
				System.out.println(phnmbr);
		
				for(int i=0; i<40; i++)
					if(i%2 != 0)
					System.out.println(i);
						
					
	}
}

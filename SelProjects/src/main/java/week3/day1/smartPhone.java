package week3.day1;

public class smartPhone extends AndroidPhone {

	public void connectWhatsapp() {
		System.out.println("connected to whatsapp");
	}
	
	public static void main(String[] args) {
		smartPhone obj = new smartPhone();
		obj.connectWhatsapp();
		obj.syncContacts();
		obj.connectWhatsapp();
		obj.makeCall();
		obj.sendMessage();
		obj.takeViddeo();
		
	}
}


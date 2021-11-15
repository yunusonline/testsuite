package sel.day2;

public class ReverseWord {

	public static void main(String[] args) {
		 String s1 = "hellow world";
		 
		 String s2="";
		 
		 String[] words = s1.split("//s");
		 
		 
		 for (String w: words) {
			 StringBuilder sb = new StringBuilder(w);
			 sb.reverse();
			 
			 System.out.println(sb);
			 
			 //s2=(s2+sb.toString() + " ");
			
		}
		 System.out.println(s2);
		
		 
	}

}

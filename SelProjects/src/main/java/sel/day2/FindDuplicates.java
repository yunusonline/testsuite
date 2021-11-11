package sel.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		 
		 String str = "Mohammed Yunus";
		 int count = 0;
		 
		 char[] ch = str.toCharArray();
		 System.out.println("duplicate charactors are");
		 
		   for (int i = 0; i < str.length() ; i++) {
			  for (int j = i+1; j < str.length(); j++) {
				if (ch[i] == ch[j]){
			    		System.out.println(ch[j]);
			    		
			    		count++;
			    	
			    //break;		
				}
				
			   }
			  
		   }
		   System.out.println("\rno of times" + count);
	}
	

}

package sel.day2;

public class Student {

		 int rno;
		 String  name;
		 String division;
		 
		 void display()
		 {
			 System.out.println("Student Roll no = " + rno);
			 System.out.println("Stundent Name = " + name);
			 System.out.println("Student Division = " + division);
			 
			 
		}
		 
		 public static void main(String[] args) {
			
			 Student ob1 = new Student();
			 ob1.rno = 123;
			 ob1.name="John";
			 ob1.division="Comp Science";
			 ob1.display();
			 
					 
		}
	}



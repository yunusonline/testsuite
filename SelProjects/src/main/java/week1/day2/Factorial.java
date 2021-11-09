package week1.day2;

import java.util.Scanner;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner(System.in);
  System.out.println("enter");
  
  int input = scan.nextInt();
  
  
 int initial =1;
		 for (int i = 1; i <= input; i++) {
          initial = initial * i;
          
		}
		 System.out.println(initial);
	}

}

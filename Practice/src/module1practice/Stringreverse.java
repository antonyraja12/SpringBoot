package module1practice;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		 System.out.println("enter String values");
		 Scanner scanner=new Scanner(System.in);
		 String str=scanner.next();
		int  len=str.length();
		String revString="";
		for (int i=len;i>=0;i--) {
			revString+=str.charAt(i);
		} 
		 System.out.println(revString);


	}

}

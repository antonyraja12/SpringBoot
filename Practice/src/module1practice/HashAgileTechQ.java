package module1practice;

import java.util.Scanner;

public class HashAgileTechQ {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
				int limit=scanner.nextInt();

		int	fvalue=0,lvalue=1,tvalue=0;
		
		
		for(int i=1;i<limit;i++) {
			fvalue=lvalue;
			lvalue=tvalue;
			tvalue=fvalue+lvalue;
			
		for(int j=1;j<=tvalue;j++) {
			 
			
			System.out.print(tvalue);
			
			
			
		}
		System.out.println(" ");
		
		}
		
	}

}

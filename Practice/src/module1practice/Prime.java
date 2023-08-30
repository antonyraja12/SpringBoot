package module1practice;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		System.out.println("Enter No to find Prime or Not");
		Scanner scanner=new Scanner(System.in);
		int val=scanner.nextInt();
		if(val !=0 || val !=1) {
			if(val%2!=0) {
				System.out.println("entered number is prime no");
				
			}
			else {
				System.out.println("entered number is not a prime no");
				
			}
		}
		else {
			System.out.println("entered number is not a prime no");
			
		}
		
		
				
	}
}

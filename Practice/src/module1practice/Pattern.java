package module1practice;

import java.util.Scanner;

public class Pattern {
	public static void main( String[] args) {
		int value;
		Scanner sc =new Scanner(System.in);
		value=sc.nextInt();
		for(int i=1;i<=value;i++) {
			
			for(int k=value-i;k>=1;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i+i-1;j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}

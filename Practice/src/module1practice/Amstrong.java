package module1practice;

import java.util.Scanner;

public class Amstrong {
	
	static void  armstrong(int a) {
		int digit=0,temp,sum=0;
		temp=a;
		while (temp>0) {
			temp/=10;
			digit++;
		}
		temp=a;
		while(temp>0) {
		int last=temp%10;
		
		sum +=Math.pow(last, digit);
		
		
		
		temp/=10;			
		}
		if(a==sum) {
			System.out.println("enter number is armstrong");
		}
		else {
			System.out.println("enterde number is not armstrong");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("enter a number to find armstrong are not");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		armstrong(num);
	}

}

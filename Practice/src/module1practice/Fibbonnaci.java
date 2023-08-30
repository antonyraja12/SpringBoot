package module1practice;

import java.util.Iterator;
import java.util.Scanner;

public class Fibbonnaci {
	public static void main(String args[]) {
		
		System.out.println("enter the limit");
		Scanner scanner=new Scanner(System.in);
		int limit=scanner.nextInt();
		int firstValue=0;
		int secondValue=1,thirdValue;
		System.out.println(firstValue);
		System.out.println(secondValue);

		for(int i=0;i<=limit;i++) {

			thirdValue=firstValue+secondValue;
			firstValue=secondValue;
			secondValue=thirdValue;
			System.out.println(thirdValue);
		}
		
		
	}

}

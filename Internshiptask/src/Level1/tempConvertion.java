package Level1;

import java.util.Scanner;

public class tempConvertion {

	public static void main(String[] args) {
		System.out.println("Enter Temprature in celcius");
		Scanner sc=new Scanner(System.in);
		float temp=sc.nextFloat();
		float fah=(temp*9/5)+32;
		
		System.out.println("Temperature in Fahrenheit   "+fah +" F");
		sc.close();
	}

}

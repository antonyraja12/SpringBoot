package Level1;

import java.util.Scanner;

public class studentGrade {
	public static void main(String args[]) {
		float total=0,avg;
		System.out.println("Enter the no subects within 10");
		Scanner scanner=new Scanner(System.in);
		int subjectCount=scanner.nextInt();
		System.out.println("enter the marks one by one");
		 float[] Marks= new float[10];
		for (int i=0;i<subjectCount;i++) {
	 	Marks[i]=scanner.nextFloat();
	 	 total += Marks[i];
	 	 	}
		System.out.println("Total Marks :"+total);
		avg=total/subjectCount;
		System.out.println("Average :"+avg);
		if (avg>=80 && avg<100) {
			System.out.println("Grade :distiction");
		}
		else if (avg>=60 &&avg<80) {
			System.out.println("Grade :First Class");
		}
		else if (avg>=50 &&avg<60) {
			System.out.println("Grade :Second Class");
			
		}
		else if (avg>=40 && avg <50) {
			System.out.println("Grade :Third Class");
			
		}
		else {
			System.out.println("Sorry !!! your average Bleow 40  ");
		}
		scanner.close();
		
	}
}

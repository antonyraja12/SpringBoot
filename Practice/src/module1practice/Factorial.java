package module1practice;

public class Factorial {
	public Factorial(int fact) {
		int temp=1;
		for (int i=1;i<=fact;i++) {
			temp=i*temp;
		}
		System.out.println(temp);
		 
	}
	public static void main(String args[]) {
		Factorial factorial=new Factorial(5);
		
	}

}

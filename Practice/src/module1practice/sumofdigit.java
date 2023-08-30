package module1practice;

public class sumofdigit {
	public static void sum(int sum) {
		int last=0,temp=sum;
		while(temp>0) {
				last+=temp % 10;
				temp/=10;}
				System.out.println(last);
		
		
	}
	public static void main(String args[]) {
		sumofdigit s=new sumofdigit();
		s.sum(254);
		
	}
}

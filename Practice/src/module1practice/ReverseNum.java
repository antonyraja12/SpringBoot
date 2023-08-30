package module1practice;

public class ReverseNum  {
	public static void main(String args[]) {
		int a=134;
		String str=String.valueOf(a);
	int len=str.length()-1;
	String st="";
		for(int i=len;i>=0;i-- ) {
			 st +=str.charAt(i);
			
		}
		System.out.println(st);
		
	}
	 
}
	


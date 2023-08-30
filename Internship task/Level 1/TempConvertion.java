import java.util.*;

public class TempConvertion {

    public static void main(String args[]){
        System.out.println("Enter the Temprature in Celcius");
        Scanner sc=new Scanner(System.in);
        float input_value=sc.nextFloat();
        float fah=(input_value*9/5)+32;
        System.out.println("temperature in Fahrenheit"+fah);

    }
    
}

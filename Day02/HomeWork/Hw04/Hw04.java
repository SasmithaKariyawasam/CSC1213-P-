import java.util.Random;
import java.util.Date;

public class Hw04{
	public static void main(String[] args){
		System.out.println("Max:"+Math.max(4,19));
		System.out.println("Min:"+Math.min(-5,12));	
		System.out.println("Square:"+Math.sqrt(256));	//squre
		System.out.println("Absolute"+Math.abs(-4.9));	//get absolute value
		System.out.println("Round"+Math.round(7.158));	//roundup the values
		
		String name = "Java";
		System.out.println("Length:"+name.length());	//get the character size of a string
		System.out.println(name.toUpperCase());	//makes all letters Capital
		System.out.println(name.toLowerCase());	//makes all letters Simple
		
		int Num1 = Integer.parseInt("150"); //changes the string value to integer
		double Num2 = Double.parseDouble("45.98");	//changes the string value to double
		System.out.println(Num1+Num2);
		
		Random random = new Random();
		int Num3 = random.nextInt(10);
		System.out.println(Num3);
		
		Date date = new Date();
		System.out.println(date);
	}
}
		
		
		
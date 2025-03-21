public class Hw03{
	public static void main(String[] args){
		int Num = 1865;
		
		double convertDouble = (double) Num; //convert to double
		System.out.println("Value of "+Num+" After converting is "+convertDouble+".");
		
		int backToInt = (int) convertDouble; //convert to int again	
		System.out.println("Value of "+convertDouble+" After converting is "+backToInt+".");	
	}
}
		
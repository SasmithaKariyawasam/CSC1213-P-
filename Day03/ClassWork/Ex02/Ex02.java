import java.util.Scanner;

public class Ex02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Values to Check What is Maximum");
		System.out.println("Enter First value: ");
		int Num1 = scanner.nextInt();
		System.out.println("Enter Second value: ");
		int Num2 = scanner.nextInt();
		System.out.println("Enter Third value: ");
		int Num3 = scanner.nextInt();
		
		if(Num1>Num2){
			if(Num1>Num3){
				System.out.println(Num1+" is the Greatest Value.");
			}else{
				System.out.println(Num3+" is the Greatest Value");
			}
		}
		else{
			if(Num2>Num3){			
				System.out.println(Num2+" is the Greatest Value.");
			}else{
				System.out.println(Num3+" is the Greatest Value");
			}
			}
	}
}


				
		
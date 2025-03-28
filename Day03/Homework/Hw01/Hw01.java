import java.util.Scanner;
public class Hw01{
	public static void main(String[] args){
		System.out.println("Check If a number devisible by 5 and 10");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Num = scanner.nextInt();
		
		if (Num%5==0 && Num%10==0)
		{
			System.out.println("Number is divisible by both numbers ");
		}else
		{
			System.out.println("Number is not divisible by both numbers");
		}
	}
}
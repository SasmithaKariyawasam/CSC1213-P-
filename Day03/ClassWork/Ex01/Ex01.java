import java.util.Scanner;

public class Ex01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number to Check: ");
		int Num = scanner.nextInt();
		
		if (Num>0){
			System.out.println("Positive Number");
		}else if(Num <0){
			System.out.println("Negative Number");
		}else{
			System.out.println("Number is Zero");
		}
	}
}
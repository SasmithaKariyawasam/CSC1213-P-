import java.util.Scanner;
class IFStatements{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int Num = scanner.nextInt();
		
		if(Num%2==0){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
	}
}
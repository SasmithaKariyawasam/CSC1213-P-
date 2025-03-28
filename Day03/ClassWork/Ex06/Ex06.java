import java.util.Scanner;

public class Ex06{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int Num1 = scanner.nextInt();
		System.out.println("Enter the Number 2: ");
		int Num2 = scanner.nextInt();
		
		for(int i=0; i<= Num1; i++){
			System.out.println(" Value for i is "+i);
			for(int j=1; j<=Num2; j++){
					System.out.print(" Value for j is "+j);
			}
			System.out.println();
		}
	}
}
		
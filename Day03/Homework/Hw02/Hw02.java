import java.util.Scanner;
public class Hw02{
	public static void main(String[] args){
		System.out.println("Printing a star pattern!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how manny rows of star you need: ");
		int row = scanner.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		
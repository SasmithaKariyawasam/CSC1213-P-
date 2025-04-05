import java.util.Scanner;

public class Ex02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double sum=0;
		char yn = ' ';
		
		do{
			System.out.println("Enter the number: ");
			double Num= scanner.nextDouble();
			sum=sum+Num;
			System.out.println("Do you want to continue(Y/N): ");
			yn = scanner.next().charAt(0);
		}while(yn=='y' || yn=='Y');
		
		System.out.println("Sum: "+sum);
	}
}
			
		

		

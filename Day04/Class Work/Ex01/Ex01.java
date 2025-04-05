import java.util.Scanner;

public class Ex01{
	public static void main(String[] args){
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the number you want sum of all: ");
		int Num = scanner.nextInt();
		
		for(int i=0;i<=Num;i++){
			sum=sum+i;
		}
		System.out.println("Sum is: "+sum);;
	}
}
		
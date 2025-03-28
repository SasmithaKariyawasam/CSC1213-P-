import java.util.Scanner;

public class Ex05{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter How many numbers you need to Show: ");
		int Num = scanner.nextInt();
		
		for(int i = 1; i<=Num ; i++){
			System.out.print(i+"\t");
		}
	}
}
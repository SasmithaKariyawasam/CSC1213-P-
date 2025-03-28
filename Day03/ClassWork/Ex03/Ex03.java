import java.util.Scanner;

public class Ex03{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Day Number Between 1 to 7:");
		int Day = scanner.nextInt();
		
		switch(Day){
			case 1:
			System.out.println("It's Monday");
			break;
			case 2:
			System.out.println("It's Tuesday");
			break;
			case 3:
			System.out.println("It's Wednesday");
			break;
			case 4:
			System.out.println("It's Thursday");
			break;
			case 5:
			System.out.println("It's Friday");
			break;
			case 6:
			System.out.println("It's Saturday");
			break;
			case 7:
			System.out.println("Ït's Sunday");
			break;
			default:
			System.out.println("Please Enter a Valid Input!");
			break;
		}
	}
}
			
import java.util.Scanner;

public class Ex04{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Check Vowels");
	System.out.println("Please Enter the Letter here: ");
	char Letter = scanner.next().charAt(0);
	
	switch(Letter){
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
		System.out.println("It is a Vowel");
		break;
		default:
		System.out.println("Not a Vowel!");
		break;
		}
	}
}
	
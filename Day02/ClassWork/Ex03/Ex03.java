import java.util.Scanner;
class UserInput{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String fName = scanner.nextLine();
		
		System.out.print("Enter Your Last Name: ");
		String lName = scanner.next();
		
		System.out.print("Enter Your Age: ");
		int Age= scanner.nextInt();
		
		System.out.println("Full Name: "+fName+" "+lName+"\nAge: "+Age);
	}
}
import java.util.Scanner;
class Student{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String Name = scanner.nextLine();
		
		System.out.print("Enter Your Age: ");
		int Age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Registration Number: ");
		String regNum = scanner.nextLine();
		
		System.out.print("Enter your Gender(M or F): ");
		char Gender = scanner.next().charAt(0);
		
		System.out.print("Mobile Number: ");
		long Number = scanner.nextLong();
		
		System.out.print("GPA: ");
		double gpa = scanner.nextDouble();
		
		System.out.print("\nName: "+Name+"\nRegistration Number: "+regNum+"\nGender: "+Gender+"\nMobile Number: "+Number+"\nGPA: "+gpa);
	}

}
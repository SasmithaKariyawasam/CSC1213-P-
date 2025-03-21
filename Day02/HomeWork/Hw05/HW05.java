import java.util.Scanner;

class HW05{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double len = scanner.nextDouble();
		
		System.out.printf("Square: %.2f\n",len*len);  
		
		/*	caps the value to 2 decimal points
			
			Typing %.3f\n inside double quotation marks make the output's decimal values limited as we want
		
		*/
		
		System.out.printf("Cube: %.3f\n",len*len*len); 
		System.out.printf("Power to the fourth: %.4f\n",Math.pow(len,4));  
		
	}
}
		
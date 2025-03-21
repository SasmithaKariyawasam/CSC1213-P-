import java.util.Scanner;

public class Hw01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Boolean
		System.out.println("Input the Boolean Value: ");
		boolean Val1 = scanner.nextBoolean();
		System.out.println("Output: "+Val1);
		
		//Byte
		System.out.println("Input the Byte Value: ");
		byte Val2 = scanner.nextByte();
		System.out.println("Output: "+Val2);
		//Short
		System.out.println("Input the Short Value: ");
		short Val3 = scanner.nextShort();
		System.out.println("Output: "+Val3);
		//Integer
		System.out.println("Input the Interger Value: ");
		int Val4 = scanner.nextInt();
		System.out.println("Output: "+Val4);
		//Float
		System.out.println("Input the Float Value: ");
		float Val5 = scanner.nextFloat();
		System.out.println("Output: "+Val5);
		//Double
		System.out.println("Input the Double Value: ");
		double Val6 = scanner.nextDouble();
		System.out.println("Output: "+Val6);
		//Long
		System.out.println("Input the Long Value: ");
		long Val7 = scanner.nextLong();
		System.out.println("Output: "+Val7);
	}
}
		
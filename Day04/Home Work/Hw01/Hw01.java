import java.util.Scanner;

public class Hw01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the integer array: ");
		int size = scanner.nextInt();
		
		int Num[] = new int[size];
		for(int i=0;i<Num.length;i++){
			System.out.println("Enter the value for "+(i+1)+"th element: ");
			Num[i] = scanner.nextInt();
		}System.out.println("Done");
		
		System.out.println("These are the Elements of the array");
		for(int i=0;i<Num.length;i++){
			System.out.print(Num[i]+"\t");
		}
		System.out.println(" ");
		
		int sum=0;
		int max=Num[0],min = Num[0];
		double avg;
		for(int i=1;i<Num.length;i++){
			if(max<Num[i]){
				max = Num[i];
			}
			
			
		}System.out.print("Max: "+max);
		System.out.println(" ");
		
		for(int i=1;i<Num.length;i++){
			if(min>Num[i]){
				min = Num[i];
			}
			
		}System.out.print("Min: "+min);
		System.out.println(" ");
		
		for(int i=0;i<Num.length;i++){
			sum=sum+Num[i];
			}
		System.out.print("Sum: "+sum);
		System.out.println(" ");
		
		for(int i=0;i<Num.length;i++){
			sum=sum+Num[i];
			}
		avg = sum/Num.length;
		System.out.print("Average: "+avg);
		System.out.println(" ");
		
		System.out.println("Enter the element you want to find: ");
		int find = scanner.nextInt();
		boolean found= false;
		int place=0;
		for(int i=0;i<Num.length;i++){
			if(find==Num[i]){
				found=true;
				place=i+1;
			}
		}
		if(found==true){
			System.out.println("Found your element at "+place+"th place");
		}else{
			System.out.println("Not found!");
			}
		
		boolean uniq = true;
		for(int i=0;i<Num.length;i++){
			for(int j=i+1;j<Num.length;j++){
				if(Num[i]==Num[j]){
					uniq = false;
				}
			}
		}
		
		if(uniq==true){
			System.out.println("This is a unique Array");
		}else{
			System.out.println("This is not a unique Array");
			}
		
	}
}	
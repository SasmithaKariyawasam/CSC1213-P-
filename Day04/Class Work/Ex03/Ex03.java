public class Ex03{
	public static void main(String[] args){
		int num1[] = new int[5];
		num1[0] = 54;
		num1[1] = 24;
		num1[2] = 04;
		num1[3] = 32;
		num1[4] = 68;
		
		for(int i=0; i<num1.length; i++){
			System.out.print(num1[i]+"\t");
		}
		
		System.out.println(" ");
		
		int Num2[]={52,98,33,8,65,7};
		for(int j=0; j<Num2.length; j++){
			System.out.print(Num2[j]+"\t");
		}
		
		System.out.println(" ");

		String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for( String day: days){
			System.out.println(day);
		}
	}
}
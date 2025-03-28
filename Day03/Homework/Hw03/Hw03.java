public class Hw03{
	public static void main(String[] args){
		int row = 10;

		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==5)
				{
				break;
				}else if(j==7)
				{
				continue;
				}else
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
		
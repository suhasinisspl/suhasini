
public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
	System.out.println("Value of i:"+i+" and value of j:"+j);
			}
			System.out.println("return values i & j");
		}
		
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print('@');
			}
			System.out.println();
		}


	}

}

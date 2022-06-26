//While Loop
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=99;
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
//Do While		
		int j = 11;
		do
		{
			System.out.println(j);
			j++;
		}while(j<=1);
//For 
			for(int i1 = 1; i1<=100 ; i1++)   //(int i = 100; i<=1;i--)
							{	
								System.out.print("Value of i:");
								System.out.println(i1);
							}

			}
		// other example
				int number = 7;
				boolean isPrime = true;
				{
				for(int i = 2; i < number/2; i++);
				int j1 = 0;
				{
					if(number % j1 == 0)
					{
						isPrime = false;
					}
				}
				if(isPrime == true)
				{
		System.out.println("The number is a prime number");
				}
				else
				{
		System.out.println("The number is not a prime number");
				}
				

//for, while, do while loop
// for loop
		  for(int i1=1,j11=1; i1<10||j11<10;i1++,j11++)
		  { 
			  j11++;
			  System.out.println("i="+i1+" and j="+j11); 
		  }


		  // while loop 
			  int i1=1,j11=1;
			  while(i1<10 || j11<10)
			  { 
				  i1++; j11++;
			      System.out.println("i="+i1+" and j="+j11); 
			  }	
			
		// Do while loop
			int j21 = 1, j2 = 1;
			do {
				j2++;
				j2++;
				System.out.println("i=" + j2 + " and j=" + j2);
			    } while (j2 < 10 || j2 < 10);

	}

}

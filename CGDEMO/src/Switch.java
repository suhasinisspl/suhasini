//Switch Case in Java (int)
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		  if (x == 1) 
		  { System.out.println("The value of x is 1"); } 
		  else if 
		  (x== 2) 
		  {
			  System.out.println("The value of x is 2"); } 
		  else if (x == 3)
		  { 
			  System.out.println("The value of x is 3"); } 
		  else 
		  {
		System.out.println("The value of x is other than 1,2,3"); 
		  }
		 
		
		switch (x) 
		{
		case 1: 
			System.out.println("The value of x is 4");
			break;
		case 2:
			System.out.println("The value of x is 5");
			break;
		case 3:
			System.out.println("The value of x is 6");
			break;
		default:
		System.out.println("The value of x is other than 4,5,6");
			break;
		}

//Switch Case in Java (Char)
		char p = 'F';
		switch (p) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of p is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of p is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of p is c");
			break;
		default:
	System.out.println("The value of p is other than a,b,c");
			break;
		}

//Switch Case in Java (String)
		String name = "te";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("CG");
			break;
		case "team":
			System.out.println("Java Full Stack");
			break;
		case "editor":
			System.out.println("Suhasini");
			break;
		default:
			System.out.println("Invalid entry");
			break;

	}

}
}

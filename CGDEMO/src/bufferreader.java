import java.util.Scanner;

public class bufferreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number:-  ");
		 i = sc.nextInt();
		 if(i>0)
		 {
			 System.out.println("positive number");
		 }
		 else if(i<0)
		 {
			 System.out.println("negitive number");
		 }
		 else
		 {
			 System.out.println("zero");
		 }
	}
}



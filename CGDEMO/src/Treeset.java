//collections
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ts = new TreeSet<>();

		ts.add("suhasini");
		ts.add("hiran");
		ts.add("lavanya");
		ts.add("diya");
		ts.add("shannu");
		ts.add("megi");

		for (String value : ts)

			System.out.print( value + "  ");

		System.out.println();
		
	}

}

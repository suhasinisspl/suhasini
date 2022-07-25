//collections
import java.io.*;
import java.util.*;

public class LinlkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
		
		hs.add(20);
		hs.add(25);
		hs.add(30);
		hs.add(35);
		hs.add(40);
		hs.add(45);

		System.out.println("Initial HashSet " + hs);

		hs.remove(35);
		hs.remove(45);

		System.out.println("After removing element " + hs);
		
	}

}

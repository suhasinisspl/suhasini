//collections
import java.io.*;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> Ht1 = new Hashtable<>();
		Hashtable<Integer, String> Ht2 = new Hashtable<Integer, String>();


		Ht1.put(22, "Suhasini");
		Ht1.put(25, "Kalyan");
		Ht1.put(28, "Avinash");

		Ht2.put(20, "vinni");
		Ht2.put(40, "phani");
		Ht2.put(18, "karthik");

		
		System.out.println("Student ID with Names : " + Ht1);
		System.out.println("Student ID with Names : " + Ht2);
	}

}

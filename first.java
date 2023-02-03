package qwe;

import java.util.ArrayList;

public class Demo {
	static void cities()
	{
		ArrayList l1 = new ArrayList();
		l1.add("Banglore");
		l1.add("udupi");
		l1.add("Mysore");
		l1.add("Tumkur");
		l1.add("chikamangalore");
		l1.add("Raichur");
		l1.add("Hubbali");
		l1.add("Gulbaraga");
		l1.add("Manglore");
		System.out.println(l1);	
	}
	static void states()
	{
		ArrayList l2 = new ArrayList();
		l2.add("Karnataka");
		l2.add("Mumbai");
		l2.add("Jaipur");
		l2.add("Andrapradesh");
		l2.add("Chennai");
		System.out.println(l2);
		
	}
	public static void main(String[] args)
	{
		cities();
		states();
	}
}
  
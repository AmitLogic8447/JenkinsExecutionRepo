package Set_Interface;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) 
	{
      LinkedHashSet set = new LinkedHashSet();
      
      set.add("Amit");       // HETEROGENOUS DATA IS ADDED IN SET
      set.add("rahul");
      set.add(12);
      set.add("Rohit");           //[Amit, rahul, mohit, Rohit]
      System.out.println(set);    // INSERTION ORDER IS MAINTAINED
      
     set.add("Amit");
     set.add("rahul");               // [Amit, rahul, mohit, Rohit]
     System.out.println(set);        // DUPLICATES ARE NOT ALLOWED
     
     set.add(5);
     set.add(" ");                  // Amit, rahul, mohit, Rohit, Null]
     System.out.println(set);      // NULL IS ALLOWED
	}

}

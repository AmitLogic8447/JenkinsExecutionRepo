package Set_Interface;

import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) 
	{
        TreeSet set = new TreeSet(); // ONLY FOR HOMOGENEOUS DATA CAN BE STORED
        set.add(12);
        set.add(6);
        set.add(65);            // OUTPUT ==>>[6, 12, 65]
        System.out.println(set); //INSERTION ORDER IN  ===ASCENDING ORDER===
        
        set.add(12);
        set.add(6);             // OUTPUT ===>>[6, 12, 65]
        System.out.println(set); // DUPLICATES ARE NOT ALLOWED
        
        
       set.add(0);  // null is not allowed
       System.out.println(set);
	}

}

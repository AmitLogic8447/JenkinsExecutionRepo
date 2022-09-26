package Set_Interface;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args)
	{
            HashSet set = new HashSet();   // HETEROGENOUS DATA CAN BE STORED 
            set.add("Amit");
            set.add(6);
            set.add("Rahul");
            set.add("rohan");          // OUTPUT [Rahul, rohan, Amit, Class]
            System.out.println(set);  // INSERTION ORDER IS NOT MENTIONED.
            
           set.add("Amit");
           set.add("Class");        // [Rahul, rohan, Amit, Class]
           System.out.println(set); // DUPICATES ARE NOT ALLOWED
           
          set.add("");
          set.add("");
          set.add("");             // [, Rahul, rohan, Amit, anu, Class, monu]
          System.out.println(set); // ONLY ONE NULL VALUE IS ALLOWED.
           
     
	}

}

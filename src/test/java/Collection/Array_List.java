package Collection;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) 
	{
      ArrayList al = new ArrayList();
      al.add("Amit");
      al.add("rahul");
      al.add("sohan");
      al.add("mohit");
      
      System.out.println(al); // [Amit, rahul, sohan, mohit]
                              // INSERTION ORDER IS MAITINED 
      
      al.add("Amit");
      al.add("rahul");
      System.out.println(al); // INSERTION ORDER IS MAINTAINED
                              // DUBLICATED ARE ALLOWED
      
      
     al.add(" ");
     al.add(" ");
     System.out.println(al); // NULL VALUE IS ALLOWED
                             // MORE THEN ON NULL IS ALLOWED
     
     
	}

}

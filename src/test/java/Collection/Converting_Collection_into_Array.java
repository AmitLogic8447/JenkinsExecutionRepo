package Collection;

import java.util.ArrayList;

public class Converting_Collection_into_Array {

	public static void main(String[] args)
	{
        ArrayList arr = new ArrayList();
        arr.add(12);
        arr.add("Amit");
        arr.add(6);
        arr.add("Rohan");
        arr.add("mohit");
        arr.add(36);
        System.out.print(arr);
        System.out.println(" ");
        
        Object x[]=arr.toArray();
        for(Object o:x)
        {
        	System.out.println(o);
        }
        
	}

}

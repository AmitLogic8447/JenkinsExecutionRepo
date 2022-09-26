package Collection;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) 
	{
       LinkedList al = new LinkedList();
       al.add("Amit");
       al.add("rahul");
       al.add("mohit");
       
       System.out.println(al);   // INSERTION ORDER IS MAINTAINED.
       
       al.add("Amit");
       al.add("rahul");
       
       System.out.println(al);  //DUPLICATES ARE ALLOWED'
       
         al.add("");
         al.add("");
         
         System.out.println(al); // NULL INSERTION IS ALLOWED
         
         
    //     ARRAYLIST                           LINKEDLIST
    //   java.util.ArrayList                   java.Util.LinkedList;
         
    //  Data is added based on shifting       data added based on the nodes .     
         
	}

}

package Non_Static_Example;

public class Non_Static_Variables
{
	//NON STATIC VARIABLE CAN CALL INSIDE STATIC METHOD BY CREATING OBJECT.
	// NON STATIC VARIABLE BELONGS TO THE INSATNACE OF THE CLASS.
	int b=32;

	public static void main(String[] args) 
	{
    
		Non_Static_Variables ob=new Non_Static_Variables();
		System.out.println(ob.b); //WE CAN CALL BY CREATING OBJECT
		
		
	}

}

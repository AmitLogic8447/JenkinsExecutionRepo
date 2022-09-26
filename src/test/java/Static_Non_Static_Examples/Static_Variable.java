package Static_Non_Static_Examples;

public class Static_Variable
{
	
	//DECLARING ONE STATIC VARIABLE INSIDE THE CLASS AND OUTSIDE THE METHOD.
	//STATIC VARIABLE IS BELONGS TO THE CLASS RATHER THAN OBJECT;
	// STATIC VARIABLES IS COMMON FOR ALL;
	
	static  int a=21;
	
	

	public static void main(String[] args)
	{
		
     System.out.println(a);
     a=35;
     System.out.println(a);
     
	}

}

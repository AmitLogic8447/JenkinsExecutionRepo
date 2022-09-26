package Non_Static_Example;

public class Non_Static_Method
{
	void display()  // NON STATIC METHOD 
	{
		System.out.println("hii amit");
	}

	public static void main(String[] args)
	{
		Non_Static_Method ob=new Non_Static_Method();
		
     ob.display(); // CAN CALL BY CREATING OBJECT
	}

}

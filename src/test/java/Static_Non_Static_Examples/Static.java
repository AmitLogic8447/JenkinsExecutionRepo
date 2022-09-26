package Static_Non_Static_Examples;

 class Static 
{
	int roll;     // Instance variable of class which belongs to object 
	String name;
	static String school="tyss";// class variable
	
	
	// CONSTRUCTOR USED IN THIS PROGRAM
	Static (int r,String n)
	{
		roll=r;
		name=n;
		
	}
	
	// NON STATIC METHOD 
	public void method()
	{
		System.out.println(name+" "+roll+" "+school);
	}
}
// ANOTHER CLASS 
 class Test
{
	
	public static void main(String[] args)
	{
		// CREATING OBJECT FOR NON STAIC VARIABLE ALONG WITH PARAMETERIZE CONSTRUCTORS
		Static ob=new Static(32,"Amit");  //OUTPUT===>>Amit 32 tyss
		ob.method();
		
		Static ob1=new Static(11,"rahul"); // OUTPUT==>>rahul 11 tyss
		ob1.method();
	}
}

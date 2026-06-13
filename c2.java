class c2
{
	public static void main(String ar[])
	{
		System.out.println("softwaves_1");
		int x=Integer.parseInt(ar[0]);
		int y=Integer.parseInt(ar[1]);
		try 
		{
			System.out.println(x/y);
			
		}
		catch(ArithmeticException e1)
		{
			System.out.println("arithmetic exception handle");
			
		}
		System.out.println("softwaves_100");
	}

}
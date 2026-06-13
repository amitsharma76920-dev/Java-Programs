/*class Demo129
{
	public static void main(String ar[])
	{int s=0;
		int x[]={50,60,40,45,49,100};
		for(int i:x)
		{
			s=s+i;
		}
			System.out.println("sum="+s);
		System.out.println(s/6);
		
        
	}
	
}*/
  abstract class A{
	
	abstract void show();	
	abstract void show1();	
	
	
}
class B extends A
{
	void show()
	{
		System.out.println("amit");
	}
	
	 void show1()
	 {
		  show();
	 }	 
}

class Demo129
{
	public static void main(String ar[])
	{
		B b1=new B();
		b1.show();
	}
}





































































/*class A
{
	int x,y;
	void get(int a,int b)
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println("sum="+(x+y));
	}
}
class B extends A
{
	void sub()
	{
		System.out.println("sub="+(x-y));
	}
}
class Amit2
{
	public static void main(String ar[])
	{
B a1=new B();
a1.get(9,9);
a1.sum();
a1.sub();
	}
}
*/
import java.util.Scanner
class Amit2
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no.1");
		byte x=sc.nextByte();
		System.out.println("enter no.2");
		byte y=sc.nextByte();
		System.out println("sum="+(x+y));
	}
}
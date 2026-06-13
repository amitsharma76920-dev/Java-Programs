class A{
	A(int x,int y){
		System.out.println("sum = "+(x+y));
	}
}
class B extends A{
	B(int x ,int y){
		super(x,y);
		System.out.println("multi ="+(x*y));
	}
}
class Demo101{
	public static void main(String ar[]){
		B b1=new B(10,20);
	}
}

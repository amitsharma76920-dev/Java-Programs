class A
{
void sum(int...a,float..b)
{
int s=0;
for(int i:a)
{
s=s+i;	
}
System.out.println("Sum="+s);

}


}
class Demo19
{
public static void main(String args[])
{
A a=new A();
a.sum(100,20,30);
a.sum(10,20,30);
}
}
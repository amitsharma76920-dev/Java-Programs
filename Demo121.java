class Demo121
{
	public static void main(String args[])
	{
		int c = 0;

for(int i = 1; i <= 9; i++)
{
    if(i <= 5)
        c++;
    else
        c--;

    for(int j = 1; j <= c; j++)
    {
        System.out.print("*");
    }

    System.out.println();
}
	}
}
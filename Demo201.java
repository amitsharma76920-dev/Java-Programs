/*		 System.out.print("*");

class Demo201
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=5;j++)
			{
				if((i+j)>=6&&(i+j)<=10)
				{
					System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
					
			}
				System.out.println();
		}
	}
}
/*
class Demo201
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=5;j++)
			{
				if( (i<=5&&j<=i)||(i>5&&j<=10-i))
				{
					System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
					
			}
				System.out.println();
		}
	}
}  

class Demo201
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j<=i&&(i+j)<=10)
				{ 
					System.out.print("*");
				}
				else
				{
					
						System.out.print(" ");
				}
					
			}
				System.out.println();
		}
	}
}
/*
class Demo201
{
public staticvoid main(String ar[])	
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
        System.out.print("* ");
    }

    System.out.println();
}
}
}

class Demo201
{
	public static void main(String ar[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}
}

class Demo201 
{
    public static void main(String[] args) {

        char ch = 'A';

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 25; j++) {

                if ((i == 0 && j == 12)||
				    (i == 1 && (j == 8 || j == 16)) ||
                    (i == 2 && (j == 5 || j == 19)) ||
                    (i == 3 && (j == 2 || j == 22)) ||
                    (i == 4 && (j == 0 || j == 24)) ||
                    (i == 5 && (j == 0 || j == 24)) ||
                    (i == 6 && (j == 2 || j == 22)) ||
                    (i == 7 && (j == 8 || j == 16)) ||
                    (i == 8 && j == 12)) {

                    System.out.print("*");
                }
				else {
                    System.out.print(" ");
                }
            }

            ch++;
            System.out.println();
        }
    }
}

 class Demo201{
    public static void main(String[] args)
 {

        int[] left  = {12, 8, 5, 3, 0, 0, 2, 8, 12};
        int[] right = {12,16,19,22,24,24,22,16,12};

        char ch = 'A';

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 25; j++) {

                if (j == left[i] || j == right[i])
                    System.out.print(ch);
                else
                    System.out.print(" ");
            }

            ch++;
            System.out.println();
        }
    }
}
/*
class Demo201
{
	public static void main(String ar[])
	{
		int i,j;
		for(i=1;i<=11;i++)
		{
			for(j=1;j<=11;j++)
			{
				if((i+j)<=7||(i+j)>=17||(j-i)>=5||(i-j)>=5)
				{
				
					System.out.print("*");
				
				}
				else 
				{
					System.out.print(" ");
				}
		    }
			System.out.println();
		}
	}
}



class Demo201
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=11;j++)
			{
				  if ((i >= 3 && j >= (i - 2) && (i + j) <= 14) || 
            (i == 1 && j != 5 && j != 6 && j != 7) || 
            (i == 2 && j != 6)) 
				{
					System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
					
			}
				System.out.println();
		}
	}
}*/
 class Demo201{
    public static void main(String[] args)
 {

        int[] left  = {12, 8, 5, 3, 0,  0, 2, 8, 12};
        int[] right = {12,16,19,22,24,24,22,16,12};

        char ch = 'A';

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 25; j++) {

                if (j == left[i] || j == right[i])
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            ch++;
            System.out.println();
        }
    }
}

































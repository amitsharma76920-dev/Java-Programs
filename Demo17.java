import java.io.*;

class Demo17
{
    public static void main(String ar[]) throws Exception
    {
        PrintWriter pw = new PrintWriter("xyz.txt");

        pw.print("sikku");

        pw.close();

        System.out.println("File Created");
    }
}
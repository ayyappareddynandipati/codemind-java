import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        for(int i=b;i<=c;i++)
        {
            System.out.println(a + " x " + i + " = " + (a * i));

        }
    }
}
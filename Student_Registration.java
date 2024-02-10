import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            if ((b-c) >= a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

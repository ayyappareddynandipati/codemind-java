import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = Math.abs(a-b);
            if (a==b || d>=a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
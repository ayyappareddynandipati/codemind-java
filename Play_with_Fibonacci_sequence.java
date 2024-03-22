import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0,b=1;
        System.out.print(a + " " + b + " ");
        for(int i=0;i<t-2;i++)
        {
            int c = a + b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
    }
}
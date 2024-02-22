import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a*1)+(b*2);
        if (c%2==0) 
        {
            if (a==0 && b%2!=0)System.out.print("NO");
            else System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
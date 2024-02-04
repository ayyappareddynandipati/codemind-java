import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if (a==0 && b%2==0)
        System.out.print("YES");
        else if (a==0 && b%2!=0)
        System.out.print("NO");
        else if ((a+(b*2))%2==0)
        System.out.println("YES");
        else System.out.println("NO");
    }
}
import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if (5*a >= b) System.out.print("YES");
        else System.out.print("NO");
    }
}
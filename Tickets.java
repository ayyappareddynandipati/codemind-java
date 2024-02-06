import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        if (4*a>1000) System.out.print("NO");
        else System.out.print("YES");
    }
}
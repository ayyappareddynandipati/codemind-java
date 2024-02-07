import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        if (a<=1) System.out.print(0);
        else if (a==2) System.out.print(1);
        else System.out.print(2);
    }
}
import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        double b = 32.0 + (a*9.0/5.0);
        System.out.printf("%.2f",b);
    }
}
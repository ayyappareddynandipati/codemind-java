import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println("Sum:" + (a+b));
        System.out.println("Difference:" + (a-b));
        System.out.println("Product:" + (a*b));
        System.out.println("Quotient:" + (a/b));
        System.out.println("Remainder:" + (a%b));
    }
}
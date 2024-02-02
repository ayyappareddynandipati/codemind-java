import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner (System.in);
        int a = read.nextInt();
        if (a%100<10) System.out.println("0" + a%100);
        else System.out.println(a%100);
    }
}
import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/365);
        System.out.println((n%365)/7);
    }
}
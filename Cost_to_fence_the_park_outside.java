import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int c = sc.nextInt();
        int res = (l+(2*w))*(b+(2*w))-(l*b);
        System.out.print(res*c);
    }
}
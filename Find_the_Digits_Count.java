import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int) (Math.log10(a) + 1);
        System.out.print(b);
    }
}

import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(s.substring(a,b+1));
    }
}
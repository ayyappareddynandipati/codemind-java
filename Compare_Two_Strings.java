import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.equals(s2) == true) System.out.print("Strings are Equal");
        else System.out.print("Strings are not Equal");
    }
}
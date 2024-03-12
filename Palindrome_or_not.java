import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        boolean f = true;
        String s = s1.toLowerCase();
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            if (s.charAt(i)!=s.charAt(n-1-i))
            {
                f=false;
                break;
            }
        }
        if (f==false) System.out.print("False");
        else System.out.print("True");
    }
}

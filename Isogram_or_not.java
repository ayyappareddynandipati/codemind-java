import java.util.*;
import java.util.Arrays;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean f = true;
        char[] t = s.toCharArray();
        Arrays.sort(t);
        for(int i=0;i<s.length()-1;i++)
        {
            if (t[i]==t[i+1])
            {
                f=false;
            }
        }
        if (!f) System.out.print("False");
        else System.out.print("True");
    }
}
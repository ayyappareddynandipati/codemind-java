import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if (c>=48 && c<=57)
            {
                cnt++;
            }
        }
        if (cnt==0) System.out.print("Doesn't contain digit");
        else System.out.print("Contains " + cnt + " digit");
    }
}
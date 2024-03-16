import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            if (s.charAt(i)==' ')
            {
                cnt++;
            }
        }
        System.out.print(n-cnt);
    }
}
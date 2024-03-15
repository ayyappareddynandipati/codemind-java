import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = s1.toLowerCase();
        int cnt=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u')
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
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
            char s1 = s.charAt(i);
            if ((s1>=33 && s1<=47) || (s1>=58 && s1<=64) || (s1>=91 && s1<=96) || (s1>=123 && s1<=126))
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
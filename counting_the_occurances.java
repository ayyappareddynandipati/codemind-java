import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char s = sc.nextLine().charAt(0);
        int cnt=0;
        for(int i=0;i<a.length();i++)
        {
            if (a.charAt(i)==s)
            {
                cnt++;
            }
        }
        if (cnt>0) System.out.print(cnt);
        else System.out.print(-1);
    }
}
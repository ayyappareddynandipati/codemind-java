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
            if (s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u')
            {
                cnt+=1;
            }
        }
        System.out.print(cnt);
    }
}
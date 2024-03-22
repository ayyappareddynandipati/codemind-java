import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while(n>0)
        {
            n--;
            char c = (char)('A' + n%26);
            s=c+s;
            n=n/26;
        }
        System.out.print(s);
    }
}
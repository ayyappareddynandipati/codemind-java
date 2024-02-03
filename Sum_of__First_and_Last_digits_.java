import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int first=0,last=n%10;
        for(int i=0;i<n;i++)
        {
            first=n/10;
            n=n/10;
        }
        System.out.println(first+last);
    }
}
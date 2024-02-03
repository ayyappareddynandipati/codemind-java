import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int c=0;
        for(int i=0;i<n+1;i++)
        {
            c+=i;
        }
        System.out.println(c);
    }
}
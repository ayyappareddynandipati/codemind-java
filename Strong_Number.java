import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int b=n;
        while(n>0)
        {
            int rem = n%10;
            int a = 1;
            for(int i=1;i<=rem;i++)
            {
                a=a*i;
            }
            sum+=a;
            n=n/10;
        }
        if (sum==b) System.out.print("The number " + b + " is a strong number");
        else System.out.print("The number " + b + " is not a strong number");
    }
}
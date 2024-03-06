import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a*a;
        int sum=0;
        while(b>0)
        {
            int rem = b%10;
            sum+=rem;
            b=b/10;
        }
        if (a==sum) System.out.print("Neon Number");
        else System.out.print("Not Neon Number");
    }
}
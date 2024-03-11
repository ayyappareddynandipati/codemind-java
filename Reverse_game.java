import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int sum=0,rem;
            while(n!=0)
                {
                    rem=n%10;
                    sum=sum*10+rem;
                    n=n/10;
                }
            System.out.print(sum + " ");
        }
    }
}
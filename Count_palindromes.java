import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt=0;
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int a = n;
            int sum=0;
            while(n!=0)
            {
                int rem=n%10;
                sum=sum*10+rem;
                n=n/10;
            }
            if (sum==a) 
            {
                cnt+=1;
            }
        }
        System.out.print(cnt);
    }
}
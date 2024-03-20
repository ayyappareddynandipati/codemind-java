import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if (i%2==0)
            {
                sum1+=a[i];
            }
            else
            {
                sum2+=a[i];
            }
        }
        if (Math.abs(sum1-sum2)%4==0) System.out.print("X");
        else System.out.print("Y");
    }
}
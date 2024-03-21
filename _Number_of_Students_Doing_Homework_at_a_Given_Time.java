import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int j=0;j<n2;j++)
        {
            b[j]=sc.nextInt();
        }
        int n = sc.nextInt();
        int cnt=0;
        for(int i=0;i<n1;i++)
        {
            if (a[i]<= n && b[i]>=n)
            {
                cnt+=1;
            }
        }
        System.out.print(cnt);
    }
}
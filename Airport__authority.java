import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t = sc.nextInt();
        int cnt=0;
        for(int j=0;j<n;j++)
        {
            if (arr[j]>t)
            {
                cnt+=1;
            }
        }
        System.out.println(n+cnt);
    }
}
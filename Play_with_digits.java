import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int sum=0;
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<t;j++)
        {
            while(arr[j]!=0)
            {
                int rem=arr[j]%10;
                sum+=rem;
                arr[j]=arr[j]/10;
            }
        }
        System.out.print(sum);
    }
}
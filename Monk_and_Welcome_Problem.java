import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] sum = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }for(int i=0;i<n;i++)
        {
            sum[i]=arr1[i]+arr2[i];
        }
        for(int num : sum)
        {
            System.out.print(num + " ");
        }
    }
}
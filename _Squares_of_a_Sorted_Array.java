import java.util.*;
import java.util.Arrays;
public class MyClass
{
    public static void SqRt(int arr[])
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SqRt(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
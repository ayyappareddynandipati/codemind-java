import java.util.*;
public class MyClass
{
    public static void MoveZeroes(int arr[])
    {
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]!=0)
            {
                arr[cnt++]=arr[i];
            }
        }
        while(cnt<arr.length)
        {
            arr[cnt++]=0;
        }
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
        MoveZeroes(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
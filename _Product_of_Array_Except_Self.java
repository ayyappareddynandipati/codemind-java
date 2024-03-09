import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pro=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            pro*=arr[i];
        }
        for(int num : arr)
        {
            System.out.print(pro/num + " ");
        }
    }
}

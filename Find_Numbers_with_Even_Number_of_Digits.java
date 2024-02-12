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
            arr[i] = sc.nextInt();
        }
        int cnt=0;
        for(int j=0;j<n;j++)
        {
            if ((int)(Math.log10(arr[j])+1) % 2 == 0) {
            cnt += 1;
            }
        }
        System.out.print(cnt);
    }
}
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
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<n-1;i++)
        {
            if (arr[i]==arr[i+1])
            {
                cnt+=1;
                i++;
            }
        }
        System.out.print(cnt);
    }
}

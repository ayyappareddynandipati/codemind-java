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
        int[] counts = new int[101];
        for (int num : arr) {
            counts[num]++;
        }
        int[] smallerCounts = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr[i]; j++) {
                count += counts[j];
            }
            smallerCounts[i] = count;
        }
        for (int count : smallerCounts) {
            System.out.print(count + " ");
        }
    }
}
import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int[] arr = new int[a];
         for (int i = 0; i < a; i++) {
            arr[i] = read.nextInt();
        }
        int s = Arrays.stream(arr).sum();
        System.out.println(s);
    }
}

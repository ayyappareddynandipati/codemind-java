import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if (c == 'b') c1++;
            else if (c=='a') c2++;
            else if (c=='l') c3++;
            else if (c=='o') c4++;
            else if (c=='n') c5++;
        }
        int[] arr = {c1,c2,c3/2,c4/2,c5};
        Arrays.sort(arr);
        System.out.print(arr[0]);
    }
}
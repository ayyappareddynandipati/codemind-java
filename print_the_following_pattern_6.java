import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int j=a;j>=1;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

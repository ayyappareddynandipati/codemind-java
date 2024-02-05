import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=i;j<=a;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
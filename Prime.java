import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int c=1;
        for(int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                c+=1;
            }
        }
        if (c==2) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

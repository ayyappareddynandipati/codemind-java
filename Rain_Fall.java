import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        if (a<3) System.out.print("LIGHT");
        else if (a>=3 && a<7) System.out.print("MODERATE");
        else  System.out.print("HEAVY");
    }
}

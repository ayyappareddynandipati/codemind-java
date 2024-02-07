import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a>50 && b>60 && c>100) System.out.print(10);
        else if (a>50 && b>60) System.out.print(9);
        else if (b>60 && c>100) System.out.print(8);
        else if (a>50 && c>100) System.out.print(7);
        else if (a>50 || b>60 || c>100) System.out.print(6);
        else System.out.print(5);
    }
}
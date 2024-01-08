import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        char n = read.next().charAt(0);
        if (n == 'v' || n == 'V')
        {
            System.out.println("Violet");
        }
        else if (n == 'i' || n == 'I')
        {
            System.out.println("Indigo");
        }
        else if (n == 'b' || n == 'B')
        {
            System.out.println("Blue");
        }
        else if (n == 'g' || n == 'G')
        {
            System.out.println("Green");
        }
        else if (n == 'y' || n == 'Y')
        {
            System.out.println("Yellow");
        }
        else if (n == 'o' || n == 'O')
        {
            System.out.println("Orange");
        }
        else if (n == 'r' || n == 'R')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        char a = read.next().charAt(0);
        if (a >= 'A' && a <= 'Z') System.out.print("uppercase alphabet");
        else if (a >= 'a' && a <= 'z')System.out.print("lowercase alphabet");
        else System.out.print("not an alphabet");
    }
}
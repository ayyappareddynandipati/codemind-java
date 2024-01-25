import java.util.Scanner;

public class FancyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

    
        if (String.valueOf(number).length() != 10) {
            System.out.println("-1");
            return;
        }
        String numberStr = String.valueOf(number);
        for (int i = 0; i <= 7; i++) {
            if (numberStr.charAt(i) == numberStr.charAt(i + 1) && numberStr.charAt(i + 1) == numberStr.charAt(i + 2)) {
                System.out.println("FANCY NUMBER");
                return;
            }
        }
        for (int i = 0; i <= 7; i++) {
            int digit1 = numberStr.charAt(i) - '0';
            int digit2 = numberStr.charAt(i + 1) - '0';
            int digit3 = numberStr.charAt(i + 2) - '0';

            if ((digit1 == digit2 - 1 && digit2 == digit3 - 1) || (digit1 == digit2 + 1 && digit2 == digit3 + 1)) {
                System.out.println("FANCY NUMBER");
                return;
            }
        }

        for (char digit = '0'; digit <= '9'; digit++) {
            int count = numberStr.length() - numberStr.replace(String.valueOf(digit), "").length();
            if (count >= 5) {
                System.out.println("FANCY NUMBER");
                return;
            }
        }
        System.out.println("NOT A FANCY NUMBER");

    }
}


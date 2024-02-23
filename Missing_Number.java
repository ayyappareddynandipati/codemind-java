import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = N * (N + 1) / 2; 
        int givenSum = 0;

        for (int i = 0; i < N - 1; i++) {
            int num = scanner.nextInt();
            givenSum += num;
        }

        int missingNumber = sum - givenSum;
        System.out.println(missingNumber);
    }
}

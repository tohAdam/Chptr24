import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();
        int sumOfDivisors = 0;

        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) 
                sumOfDivisors += i;           
        }

        System.out.println("Sum of divisors of " + N + ": " + sumOfDivisors);

        if (sumOfDivisors == N) 
            System.out.println(N + " is a perfect number.");
    }
}

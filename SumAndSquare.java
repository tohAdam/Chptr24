import java.util.Scanner;

public class SumAndSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scan.nextInt();

        int sumOfOdds = 0;
        for (int i = 1; i <= N; i += 2) { // Increment by 2 to consider only odd numbers
            sumOfOdds += i;
        }

        int squareOfN = N * N;

        System.out.println("Sum of all odd integers from 1 to " + N + ": " + sumOfOdds);
        System.out.println(N + "^2: " + squareOfN);
    }
}

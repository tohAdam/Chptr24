import java.util.Scanner;

public class SumTwoSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();
        int count = 0;

        for (int a = 1; a * a <= N; a++) {
            int bSquare = N - a * a;
            int b = (int) Math.sqrt(bSquare);
            if (b * b == bSquare) {
                count++;
                System.out.println(N + " is the sum of 2 squares");
                System.out.println(N + " == " + a + "*" + a + " + " + b + "*" + b);
            }
        }if (count == 0) 
            System.out.println(N + " is not the sum of 2 squares");
    }
}

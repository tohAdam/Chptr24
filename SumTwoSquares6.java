import java.util.Scanner;

public class SumTwoSquares6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit: ");
        int upperLimit = scan.nextInt();

        for (int N = 1; N <= upperLimit; N++) {
            int count = 0;

            for (int a = 1; a * a <= N; a++) {
                int bSquare = N - a * a;
                int b = (int) Math.sqrt(bSquare);
                if (b * b == bSquare) {
                    count++;
                    if (count == 1)
                        System.out.println(N + " is the sum of 2 squares");          
                    System.out.println(N + " == " + a + "*" + a + " + " + b + "*" + b);
                }
            }
        }
    }
}

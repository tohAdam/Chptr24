import java.util.Scanner;

public class SumOfTwoSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scan.nextInt();
        boolean found = false;

        for (int a = 0; a * a <= N; a++) {
            for (int b = a; b * b <= N; b++) {
                if (a * a + b * b == N) 
                    System.out.println(N + " = " + a + "^2 + " + b + "^2");
                    found = true;
                    break;         
            }
            if (found) 
                break;            
        }if (!found) 
            System.out.println(N + " is not the sum of two squares.");
    }
}

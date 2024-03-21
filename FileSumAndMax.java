import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSumAndMax {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);

            int sum = 0;
            int max = 0;

            for (int i = 0; i < 5 && scanner.hasNextInt(); i++) {
                int num = scanner.nextInt();
                sum += num;
                if (i == 0 || num > max) 
                    max = num;
            }

            System.out.println("Sum of the 5 integers: " + sum);
            System.out.println("Maximum value among the 5 integers: " + max);

        } catch (FileNotFoundException e) 
            System.out.println("File not found.");
            e.printStackTrace();
    }
}

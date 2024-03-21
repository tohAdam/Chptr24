public class BighornSheepPopulation {
    public static void main(String[] args) {
        double power = 1;

        for (int t = 0; t <= 25; t++) {
            double N = 220 / (1 + 10 * power);
            System.out.println("Population at year " + t + ": " + N);

            if (N >= 80) 
                System.out.println("Population has reached 80 or more at year " + t + ". No further supervision required.");
                break;          
            power *= 0.83;
        }if (power < 0.83) 
            System.out.println("Population did not reach 80 or more in 25 years. Further supervision is required.");
    }
}

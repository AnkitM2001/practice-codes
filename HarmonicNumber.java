import java.util.*;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double harmonic = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.printf("The %dth harmonic number is: %.5f\n", n, harmonic);
    }
}

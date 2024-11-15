package oving5_1;

public class BrokUtils {

    // Statisk metode for å finne største felles divisor (GCD)
    public static int finnGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return finnGCD(b, a % b);
    }
}
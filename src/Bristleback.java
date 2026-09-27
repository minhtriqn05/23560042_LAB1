import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 * Bristleback's Quill Spray damage calculation.
 * A quill from the hit at time t still deals damage to a hit at time s
 * when s - t <= z (a hit at the exact expiry moment still counts).
 */
public class Bristleback {

    // Small tolerance for comparing doubles (27.6 - 12.6 gives 15.000000000000002).
    private static final double EPS = 1e-9;

    // Sliding window over the sorted hit times.
    // 'oldest' is the earliest hit whose quill is still embedded.
    // For hit i, quills from hits oldest..i-1 are active, so the hit deals
    // x + (i - oldest) * y damage. Each index moves forward only once -> O(n).
    public static double calculateTotalDamage(double[] times, double x, double y, double z) {
        double total = 0;
        int oldest = 0;

        for (int i = 0; i < times.length; i++) {
            // Drop quills that expired strictly before the current hit.
            while (oldest < i && times[i] - times[oldest] > z + EPS) {
                oldest++;
            }
            int activeQuills = i - oldest;
            total += x + activeQuills * y;
        }
        return total;
    }

    // Prints 580.0 as "580" and removes floating-point noise such as 12.300000000001.
    public static String formatNumber(double value) {
        return BigDecimal.valueOf(value)
                .setScale(6, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Force '.' as the decimal separator (a Vietnamese system locale expects ',').
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        double[] times = new double[n];
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextDouble();
        }
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double total = calculateTotalDamage(times, x, y, z);
        System.out.println(formatNumber(total));

        scanner.close();
    }
}

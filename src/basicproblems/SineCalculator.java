package basicproblems;
import java.lang.Math;

public class SineCalculator {

    public static double sin(double x, int n) {
        double answer = 0;
        int odd = 1;

        // Convert the angle to radians
        x = Math.toRadians(x);

        // Calculate the sine using the series expansion
        for (int i = 1; i <= n; i++) {
            double fact = factorial(odd);
            int negativity = (int) Math.pow(-1, i - 1); // Alternating sign
            double temp = Math.pow(x, odd) / fact;
            answer += negativity * temp;
            odd += 2;
        }

        return answer;
    }

    public static double factorial(int n) {
        double fact = 1;

        // Calculate factorial of the number
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        double answer = sin(30, 10);
        System.out.println("Sin(30) with 10 terms in series: " + answer);
    }
}


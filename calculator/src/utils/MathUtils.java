package utils;

public class MathUtils {
    public static double add(double var0, double var2) {
        return var0 + var2;
    }

    public static double subtract(double var0, double var2) {
        return var0 - var2;
    }

    public static double multiply(double var0, double var2) {
        return var0 * var2;
    }

    public static double divide(double var0, double var2) {
        if (var2 == (double)0.0F) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        } else {
            return var0 / var2;
        }
    }
}

package Euler;

public class Ex3 {
    public static double findLargestPrimeFactor(double number) {

        for (double i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (isPrime(number / i) == true)
                    return number / i;
                    
            }

        }
        return 1;
    }

    public static boolean isPrime(double num) {
        if (num < 2)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

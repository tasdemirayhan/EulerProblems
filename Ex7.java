package Euler;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(StPrime(6));
    }

    public static int StPrime(int s) {
        int counter = 1;// primes
        int say = 2; // all nums
        while (counter < s) {
            say++;
            if (isPrime(say))
                counter++;

        }
        return say;

    }

    public static boolean isPrime(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}

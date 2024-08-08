package Euler;

public class Ex4 {
    public static int findGreatestPalindrome() {
        int pal;
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                pal = i * j;
                if (palindrome(pal) && pal > max)
                    max = pal;
            }
        }
        return max;

    }

    public static boolean palindrome(int a) {
        int temp = a;
        int rev = 0;
        int digit;
        while (temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        return rev == a;
    }
}

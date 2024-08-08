package Euler;

public class Ex2 {
    public static int evenFibonacciNumbers() {
        int num1 = 1, num2 = 2, temp, sum = 0;
        while (num1 < 50) {
            if (num2 % 2 == 0)
                sum += num2;
            temp = num2;
            num2 = num1 + num2;
            num1 = temp;

        }
        return sum;
    }
}

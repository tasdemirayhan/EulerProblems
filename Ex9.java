package Euler;

public class Ex9 {
    public static void main(String[] args) {
        int[] array = SpecialPythagoreanTriplet(1000);

        if (array != null) {
            System.out.println(array[0] + "," + array[1] + "," + array[2]);
            System.out.println(array[0] + array[1] + array[2]);
        } else {
            System.out.println("There is no special triplet...");
        }
    }

    public static int[] SpecialPythagoreanTriplet(int sum) {
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < sum; i++) {
            for (int j = i; j < sum; j++) {
                for (int k = i; k < sum; k++) {
                    if (i + j + k == sum && Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                        return new int[] { i, j, k };
                    }
                }
            }
        }
        return null;

    }
}

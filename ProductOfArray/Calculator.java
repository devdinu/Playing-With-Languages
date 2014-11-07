package funsets;

import java.math.BigInteger;
import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        int[] array = Calculator.getArray(1, 100);
        System.out.println(Arrays.toString(array));
        System.out.println(Calculator.getProduct(array));
    }

    private static BigInteger getProduct(int[] array) {
        BigInteger result = BigInteger.ONE;
        for (int number : array) {
            result = result.multiply(BigInteger.valueOf(number));
        }
        return result;
    }

    private static int[] getArray(int start, int end) {
        int[] array = new int[end - (start - 1)];
        int index = 0;
        while (start <= end)
            array[index++] = start++;
        return array;x
    }
}

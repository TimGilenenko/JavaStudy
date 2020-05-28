package strings;

import java.util.Arrays;

public class Task7_InvertArray {
    private static int[] numbers = {1, 2, 3, 4, 5};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(invertArray(numbers)));
    }

    public static int[] invertArray(int[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        int temp = 0;

        for (int t = numbers.length - 1; t >= (numbers.length - 1) / 2; t--) {
            temp = numbers[t];
            numbers[t] = numbers[numbers.length - 1 - t];
            numbers[numbers.length - 1 - t] = temp;
        }

        return numbers;
    }
}







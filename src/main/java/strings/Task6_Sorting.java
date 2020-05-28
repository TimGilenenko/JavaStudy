package strings;

import java.util.Arrays;

//Написать метод, который принимает в себя массив int*ов
// и возвращает (return) максимальный элемент.
public class Task6_Sorting {

    private static int[] numbers = {1, 2, 3, 5, 4};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));

        System.out.println(findNumber(numbers));
    }


    public static Integer findNumber(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int res = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (res < numbers[i]) {
                res = numbers[i];
            }
        }

        return res;
    }

}

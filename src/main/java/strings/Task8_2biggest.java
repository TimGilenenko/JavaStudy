package strings;

//Написать метод, который принимает в себя массив int*ов,
//находит 2 максимальных значения и возвращает их как массив из 2-x int*ов

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Task8_2biggest {

    private static int[] numbers = {1, 2, 3, 4, 5};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(find2Number(numbers)));
    }

    public static Object[] find2Number(int[] numbers) {
        return IntStream.of(numbers)
                .distinct()
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .toArray();
    }
}

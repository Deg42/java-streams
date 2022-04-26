package es.fpdual;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Stream<Integer> numStreams = numbers.stream();

        int sum = numStreams.filter(n -> n % 2 == 1) // {1, 3, 5, 7}
                .map(n -> n * n) // {1, 9, 25, 49}
                .reduce(0, Integer::sum); // 84

        System.out.println("The sum of the odd numbers is: " + sum);
    }
}

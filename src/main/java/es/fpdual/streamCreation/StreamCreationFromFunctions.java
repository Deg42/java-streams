package es.fpdual.streamCreation;

import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationFromFunctions {
    public static void main(String[] args) {
        System.out.println("/-----First 10 numbers----/");
        Stream<Long> firstTen = Stream.iterate(1L, n -> n + 1)
                .limit(10);
        firstTen.forEach(System.out::println);
        System.out.println("/-------------------------/");

        System.out.println("/--First 20 even numbers--/");
        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);
        System.out.println("/-------------------------/");

        System.out.println("/Five Odd numbers from 100/");
        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("/-------------------------/");

        System.out.println("/---Five random numbers---/");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("/-------------------------/");

        System.out.println("/----Five random ints----/");
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("/-------------------------/");

    }
}

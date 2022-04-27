package es.fpdual.streamCreation;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StreamCreationFromStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String
        String languages = "HTML, CSS, JAVASCRIPT, JAVA C++, C#, RUBY";
        Pattern.compile(", ")
                .splitAsStream(languages)
                .forEach(System.out::println);

        // System Input
        String input = sc.nextLine();
        IntStream charStream = input.chars();
        charStream.forEach(System.out::println);
        sc.close();

        charStream.filter(ch -> !Character.isDigit((char) ch)
                && !Character.isWhitespace((char) ch))
                .forEach(ch -> System.out.print((char) ch));
    }
}

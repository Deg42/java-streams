package es.fpdual.streamCreation;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import es.fpdual.model.Student;

public class StreamCrationMain {
    public static void main(String[] args) {
        // One Value
        Stream<String> titleStream = Stream.of("Coding Bootcamp");
        titleStream.forEach(System.out::println);

        // Variable lenght argument
        Stream<String> sessionsStream = Stream.of("session1", "session2", "session3", "session4", "session5");
        sessionsStream.forEach(System.out::println);

        // Array
        String[] languages = { "java", "c++", "c#", "ruby" };
        Stream<String> languagesStream = Stream.of(languages);
        languagesStream.forEach(System.out::println);

        // Builder
        Stream<Student> studentsStream = Stream.<Student>builder()
                .add(new Student("00000000A", 24, 95, 9.5))
                .add(new Student("11111111B", 30, 90, 7.2))
                .add(new Student("22222222C", 31, 85, 8.0))
                .build();
        studentsStream.forEach(e -> System.out.println(e.getId()));

        // Range
        IntStream oneToTwenty = IntStream.range(1, 21);
        oneToTwenty.forEach(System.out::println);
    }
}

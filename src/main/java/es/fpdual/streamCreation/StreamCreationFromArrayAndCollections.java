package es.fpdual.streamCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import es.fpdual.model.Employee;

public class StreamCreationFromArrayAndCollections {
    public static void main(String[] args) {
        // IntStream
        IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        intStream.forEach(System.out::println);
        System.out.println("/-------------------------/");

        // String Array
        Stream<String> names = Arrays.stream(new String[] { "Juan", "Pepe", "Fran", "Laura", "Pablo" });
        names.forEach(System.out::println);
        System.out.println("/-------------------------/");

        // String Set
        Set<String> languagesSet = new HashSet<>();
        languagesSet.add("Java");
        languagesSet.add("C++");
        languagesSet.add("C#");
        languagesSet.add("Javascript");

        Stream<String> languagesStream = languagesSet.stream();
        languagesStream.forEach(System.out::println);
        System.out.println("/-------------------------/");

        // Object List
        List<Employee> employeetList = new ArrayList<>();
        employeetList.add(new Employee("Juan", "González", 1997, 26.5));
        employeetList.add(new Employee("Pepe", "Gómez", 2001, 22.8));
        employeetList.add(new Employee("Francisco", "Veragua", 1999, 29.5));
        employeetList.add(new Employee("Laura", "Serrano", 1996, 26.7));

        Stream<Employee> employeeStream = employeetList.parallelStream();
        employeeStream.forEach(e -> System.out.println(e.getName()));
        System.out.println("/-------------------------/");
    }
}

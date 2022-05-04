package es.fpdual.collectOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import es.fpdual.model.Employee;

public class CollectOp {
    public static void main(String[] args) {

        // Supplier<ArrayList<String>> provider = () -> new ArrayList();
        Supplier<ArrayList<String>> provider = ArrayList::new;

        // BiConsumer<ArrayList<String>, String> accumulator = (list, str) ->
        // list.add(str);
        BiConsumer<ArrayList<String>, String> accumulator = ArrayList::add;

        // BiConsumer<ArrayList<String>, ArrayList<String>> combiner = (list1, list2) ->
        // list1.addAll(list2);
        BiConsumer<ArrayList<String>, ArrayList<String>> combiner = ArrayList::addAll;

        List<String> names = Employee.employees()
                .stream()
                .map(Employee::getName)
                // .collect(provider, accumulator, combiner);
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(names);

        Set<String> dnis = Employee.employees()
                .stream()
                .map(Employee::getDni)
                .collect(Collectors.toSet());
        System.out.println(dnis);

        SortedSet<String> surnames = Employee.employees()
                .stream()
                .map(Employee::getSurname)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(surnames);
    }

}

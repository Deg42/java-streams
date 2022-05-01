package es.fpdual.intermediateOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import es.fpdual.model.Employee;
import es.fpdual.model.Employee.Gender;

public class SortOp {
    public static void main(String[] args) {
        System.out.println("Names sorted: ");
        Arrays.asList("Juan", "Pepe", "Anabel", "Elena", "Francisco", "Patricia")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nNumbers sorted: ");
        Arrays.asList(1, 4, 2, 13, 4, 3)
                .stream()
                .sorted()
                .forEach(System.out::println);

        List<Employee> employees = Employee.employees();

        System.out.println("\nEmployees sorted by default: ");
        employees.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getName()));

        System.out.println("\nEmployees sorted by birth year: ");
        employees.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee emp1, Employee emp2) {
                        return emp1.getBitrtYear() - emp2.getBitrtYear();
                    }
                }).forEach(emp -> System.out.println(emp.getName() + " " + emp.getBitrtYear()));

        System.out.println("\nMale employees sorted by salary: ");
        employees.stream()
                .filter(emp -> emp.getGender().equals(Gender.MALE))
                .sorted((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary()))
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));

    }
}

package es.fpdual.terminalOperation;

import java.util.List;
import java.util.stream.IntStream;

import es.fpdual.model.Employee;

public class SumAvgCountMaxMinOp {
    public static void main(String[] args) {

        int[] numbers = { 21, 77, 77, 59, 2, 51, 70, 95, 75, 93, 64, 88, 80, 27, 72, 11, 86, 82, 58, 24 };

        List<Employee> employees = Employee.employees();

        // Sum of elements
        System.out.println("Sum is: " +
                IntStream.of(numbers).sum());

        // Average of elements
        System.out.println("Sum is: " +
                IntStream.of(numbers).average().getAsDouble());

        // Max and Min
        System.out.println("Max is: " + IntStream.of(numbers).max().getAsInt());
        System.out.println("Min is: " + IntStream.of(numbers).min().getAsInt());

        // Count
        System.out.println("Total numbers: " + IntStream.of(numbers).count());

        // --- Employees --- //

        System.out.println("\nEmployees terminal operations");

        System.out.println("Sum of salaries: " +
                employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

        System.out.println("Average salaries: " +
                employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .average().getAsDouble());

        Employee empMaxSalary = employees.stream()
                .max((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary())).get();

        Employee empMinSalary = employees.stream()
                .min((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary())).get();

        System.out.println("Employee with max salary: " + empMaxSalary.getName() + " " + empMaxSalary.getSalary());
        System.out.println("Employee with min salary: " + empMinSalary.getName() + " " + empMinSalary.getSalary());
    }
}

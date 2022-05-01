
package es.fpdual.intermediateOperation;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

import es.fpdual.model.Employee;

public class MapOp {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .map(new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int operand) {
                        return operand * operand;
                    }
                }).forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);

        List<Employee> employees = Employee.employees();

        System.out.println("Average salary of women born in the 80's");
        double totalFemSalaryBorn80 = employees.stream()
                .filter(emp -> emp.isFemale())
                .filter(emp -> (emp.getBitrtYear() >= 1980) && emp.getBitrtYear() < 1990)
                .mapToDouble(emp -> emp.getSalary())
                .sum();

        double average = totalFemSalaryBorn80 / employees.stream()
                .filter(emp -> emp.isFemale())
                .filter(emp -> (emp.getBitrtYear() >= 1980) && emp.getBitrtYear() < 1990)
                .count();

        System.out.println("Average is : " + average);
    }
}
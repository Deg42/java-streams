package es.fpdual.intermediateOperation;

import java.util.List;
import java.util.function.Predicate;

import es.fpdual.model.Employee;

public class FilterOp {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employees();

        System.out.println("Male Employees: ");
        employees.stream()
                .filter(new Predicate<Employee>() {

                    @Override
                    public boolean test(Employee emp) {
                        return emp.isMale();
                    }

                }).forEach(emp -> System.out.println(emp.getName() + " " + emp.getSurname()));

        System.out.println("\nFemale Employees: ");
        employees.stream()
                .filter(Employee::isFemale)
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getSurname()));

        System.out.println("\nEmployees born in the 80's: ");
        employees.stream()
                .filter(e -> e.getBitrtYear() >= 1980 && e.getBitrtYear() < 1990)
                .forEach(emp -> System.out.println(
                        emp.getName() + " " + emp.getSurname() + " " + emp.getBitrtYear()));

        System.out.println("\nMale Employees whose name starts with \"J\": ");
        employees.stream()
                .filter(Employee::isMale)
                .filter(emp -> emp.getName().startsWith("J"))
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getSurname()));

        System.out.println("\nFemale Employees that earns less than 18k: ");
        employees.stream()
                .filter(Employee::isFemale)
                .filter(emp -> emp.getSalary() < 18000)
                .forEach(emp -> System.out.println(
                        emp.getName() + " " + emp.getSurname() + " " + emp.getSalary()));

        System.out.println("\nFemale Employees whose name starts with vowel and has ñ/Ñ on his surname: ");
        Predicate<Employee> femEmployee = emp -> emp.isFemale();
        Predicate<Employee> nameStartsWithVowelEmployee = emp -> (emp.getName().startsWith("A")
                || emp.getName().startsWith("E")
                || emp.getName().startsWith("I")
                || emp.getName().startsWith("O")
                || emp.getName().startsWith("U"));
        Predicate<Employee> surnameHasNWithThatLittleThingOnTop = emp -> ((emp.getSurname().contains("Ñ"))
                || (emp.getSurname().contains("ñ")));

        Predicate<Employee> elaboratedPredicate = femEmployee.and(nameStartsWithVowelEmployee)
                .and(surnameHasNWithThatLittleThingOnTop);

        employees.stream()
                .filter(elaboratedPredicate)
                .forEach(emp -> System.out.println(
                        emp.getName() + " " + emp.getSurname()));
        System.out.println("Count.. " + employees.stream().filter(elaboratedPredicate).count());

    }
}
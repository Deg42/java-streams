package es.fpdual.model;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String dni;
    private String name;
    private String surname;
    private int bitrtYear;
    private double salary;
    private Gender gender;

    public Employee(String name, String surname, int bitrtYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.bitrtYear = bitrtYear;
        this.salary = salary;
    }

    public static enum Gender {
        FEMALE, MALE
    }

    public boolean isFemale() {
        return this.gender == Gender.FEMALE;
    }

    public boolean isMale() {
        return this.gender == Gender.MALE;
    }

    public static List<Employee> employees() {
        return Arrays.asList(
                new Employee("94131590L", "Jan", "Miguel", 1997, 18000, Gender.MALE),
                new Employee("46799396P", "Isabel María", "Peña", 1983, 20000, Gender.FEMALE),
                new Employee("16199070D", "Adoracion", "Castaño", 2000, 15000, Gender.FEMALE),
                new Employee("10492815P", "Manuel Antonio", "Santana", 1959, 19000, Gender.MALE),
                new Employee("94131590L", "Eulalia", "Velez", 1989, 20000, Gender.FEMALE),
                new Employee("77748087Z", "Dario", "Menendez", 1954, 19000, Gender.MALE),
                new Employee("56854055X", "Maria Lourdes", "Blasco", 1958, 23000, Gender.FEMALE),
                new Employee("56854055X", "Diana", "Muñoz", 1958, 15200, Gender.FEMALE),
                new Employee("37853127A", "Ferran", "Barbero", 1989, 25000, Gender.FEMALE),
                new Employee("29834363M", "Adriana", "Marques", 1979, 16500, Gender.FEMALE),
                new Employee("29834363M", "Josep Maria", "Muñiz", 1966, 19300, Gender.MALE));

    }

}

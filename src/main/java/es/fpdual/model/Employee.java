package es.fpdual.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;
}

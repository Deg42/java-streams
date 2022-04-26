package es.fpdual.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String id;
    private int age;
    private double height;
    private double average;
}

package es.fpdual.collectOperation;

import java.util.Map;
import java.util.stream.Collectors;

import es.fpdual.model.Employee;

public class StreamToMapReduction {
    public static void main(String[] args) {

        Map<String, String> dniToNameMap = Employee.employees()
                .stream()
                .collect(Collectors.toMap(Employee::getDni, Employee::getName));
        System.out.println(dniToNameMap);

        Map<Employee.Gender, String> genderToNameMap = Employee.employees()
                .stream()
                .collect(Collectors.toMap(Employee::getGender, Employee::getName,
                        (name1, name2) -> String.join(", ", name1, name2)));
        System.out.println(genderToNameMap);

    }
}

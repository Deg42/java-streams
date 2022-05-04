package es.fpdual.terminalOperation;

import java.util.List;

import es.fpdual.model.Employee;

public class TraditionalEmployeeSumAvgCountMaxMinOp {
    public static void main(String[] args) {

        List<Employee> employees = Employee.employees();

        // Sum of salaries
        double sumSalaries = 0.0;
        for (Employee employee : employees) {
            sumSalaries += employee.getSalary();
        }

        System.out.println("Total salary of employees: " + sumSalaries);

        // Average salary
        double avgSalary = sumSalaries / employees.size();

        System.out.println("Average employee salary: " + avgSalary);

        // Count of employees
        System.out.println("Total number of employees: " + employees.size());

        // Max salary
        Employee empMaxSalary = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getSalary() > empMaxSalary.getSalary()) {
                empMaxSalary = employee;
            }
        }
        System.out.println("Employee with max salary: " + empMaxSalary.getName() + " " + empMaxSalary.getName());

        // Min salary
        Employee empMinSalary = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getSalary() < empMinSalary.getSalary()) {
                empMinSalary = employee;
            }
        }
        System.out.println("Employee with min salary: " + empMinSalary.getName() + " " + empMinSalary.getName());
    }
}

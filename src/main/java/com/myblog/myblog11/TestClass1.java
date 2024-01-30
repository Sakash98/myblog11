package com.myblog.myblog11;

import com.myblog.myblog11.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("mike", 30, "chennai"),
                new Employee("stallin", 25, "chennai"),
                new Employee("adam", 31, "pune"),
                new Employee("sam", 34, "bengaluru")
        );

        // Grouping employees by city
        Map<String, List<Employee>> employeesByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        // Print employees grouped by city
        employeesByCity.forEach((city, empList) -> {
            System.out.println("City: " + city);
            empList.forEach(emp -> System.out.println("\t" + emp.getName() + " - " + emp.getAge()));
        });
    }
}

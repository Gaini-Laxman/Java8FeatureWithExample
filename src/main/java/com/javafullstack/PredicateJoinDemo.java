package com.javafullstack;

import java.util.Arrays;
import java.util.List;

public class PredicateJoinDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aitha", "Hyd", "DevOps");
        Employee e2 = new Employee("Vikramaditya", "Hyd", "DevOps");
        Employee e3 = new Employee("Laxman", "Bangl", "Fullstack");
        Employee e4 = new Employee("Mounika", "Bangl", "Tester");

        List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

        emps.stream().filter(e -> e.location.equals("Bangl") && e.dept.equals("Tester")).forEach(System.out::println);

        //filter(e->e.name.startsWith("A")).
    }

}

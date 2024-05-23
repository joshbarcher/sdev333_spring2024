package test;

import objects.Employee;

import java.util.HashSet;

public class TestEmployeeRecords {
    public static void main(String[] args) {
        HashSet<String> set;

        Employee emp1 = new Employee(101, "Alice Johnson",
                "Software Engineer", 90000);
        Employee emp2 = new Employee(102, "Alice Johnson",
                "Project Manager", 110000);
        Employee emp3 = new Employee(103, "Carol White",
                "Designer", 75000);
        Employee emp4 = new Employee(102, "Alice Johnson",
                "CEO", 210000);

        //reflexive
        System.out.println(emp1.equals(emp1)); //true
        System.out.println(emp2.equals(emp2)); //true
        System.out.println(emp3.equals(emp3)); //true

        //symmetric
        if (emp1.equals(emp2)) {
            System.out.println("Must be true: " +
                emp2.equals(emp1)); //must be true
        }

        if (emp2.equals(emp3)) {
            System.out.println("Must be true: " +
                    emp3.equals(emp2)); //must be true
        }

        //transitive
        if (emp1.equals(emp2) && emp2.equals(emp3)) {
            System.out.println("Must be true: " +
                    emp1.equals(emp3));
        }

        System.out.println(emp1.equals(null));
    }
}

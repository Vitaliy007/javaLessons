package com.javalesson.constructors;

import com.javalesson.domainmodel.Employee;


public class ConstructorsMain {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Employee("Vik","qa",100);
        Employee employee1 = new Employee("John","qa",100);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

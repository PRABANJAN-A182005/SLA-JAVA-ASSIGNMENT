package com.java.hello;

class Employee {
    static int count = 0;

    void register() {
        count++;
        System.out.println("Employee Registered");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.register();
        e2.register();
        e3.register();

        System.out.println("Total Employees: " + count);
    }
}
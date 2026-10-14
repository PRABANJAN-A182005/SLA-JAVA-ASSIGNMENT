package com.java.hello;

class Student {
    String name;
    int rollNo;

    void register(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println(name + " " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.register("Arun", 101);
        s2.register("Bala", 102);
        s3.register("Kumar", 103);

        s1.display();
        s2.display();
        s3.display();
    }
}
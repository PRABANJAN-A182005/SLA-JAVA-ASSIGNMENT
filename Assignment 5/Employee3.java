class Employee3 {
    String n;

    Employee3(String x) {
        n = x;
    }

    void work() {
        System.out.println("Employee works");
    }
}

class Developer extends Employee3 {
    Developer(String x) {
        super(x);
    }

    void work() {
        System.out.println(n + " writes code");
    }
}

class Manager extends Employee3 {
    Manager(String x) {
        super(x);
    }

    void work() {
        System.out.println(n + " manages team");
    }
}

class Main {
    public static void main(String[] args) {
        Employee3 e = new Developer("Ram");
        Employee3 m = new Manager("Sam");
        e.work();
        m.work();
    }
}

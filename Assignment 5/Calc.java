class Calc {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    void bonus() {
        System.out.println("Normal bonus");
    }
}

class Manager extends Employee {
    void bonus() {
        System.out.println("High bonus");
    }
}

class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2.5, 3.5));

        Employee e = new Manager();
        e.bonus();
    }
}

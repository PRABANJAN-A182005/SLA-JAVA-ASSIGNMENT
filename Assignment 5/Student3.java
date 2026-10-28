class Student {
    String n;
    int a;

    Student(String x) {
        n = x;
    }

    Student(String x, int y) {
        n = x;
        a = y;
    }

    void show() {
        System.out.println(n + " " + a);
    }

    public static void main(String[] args) {
        Student s = new Student("Ram");
        Student t = new Student("Sam", 20);
        s.show();
        t.show();
    }
}

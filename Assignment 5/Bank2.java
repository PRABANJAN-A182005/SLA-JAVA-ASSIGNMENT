class Bank2 {
    private String n;
    private double b;

    Bank2(String x, double y) {
        n = x;
        b = y;
    }

    public String getN() {
        return n;
    }

    public double getB() {
        return b;
    }

    public void setN(String x) {
        n = x;
    }

    void withdraw(double a) {
        if (a > 0 && a <= b) {
            b -= a;
            System.out.println(b);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public static void main(String[] args) {
        Bank2 b = new Bank2("Ram", 5000);
        System.out.println(b.getN());
        b.withdraw(1000);
    }
}

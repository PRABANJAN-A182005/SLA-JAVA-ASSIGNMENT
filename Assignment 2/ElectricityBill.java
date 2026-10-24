class ElectricityBill {
    double calculateBill(int units) {
        double b = 0;
        if (units <= 100) {
            b = units * 2;
        } else if (units <= 200) {
            b = (100 * 2) + ((units - 100) * 3);
        } else {
            b = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
        return b;
    }
    double addFixedCharge(double b) {
        return b + 50;
    }
    void displayBill(double e, double f) {
        System.out.println("Energy Charge: " + e);
        System.out.println("Fixed Charge: 50.0");
        System.out.println("Final Bill: " + f);
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        int units = 250;
        double e = eb.calculateBill(units);
        double f = eb.addFixedCharge(e);
        eb.displayBill(e, f);
    }
}

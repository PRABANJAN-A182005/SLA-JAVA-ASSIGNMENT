class ShoppingCart {
    double calculateTotal(double price1, double price2, double price3) {
        return price1 + price2 + price3;
    }
	
    double calculateDiscount(double total, String membership) {
        if (membership.equalsIgnoreCase("Gold")) {
            return total * 0.20;
        } else if (membership.equalsIgnoreCase("Silver")) {
            return total * 0.10;
        } else if (membership.equalsIgnoreCase("Regular")) {
            return total * 0.05;
        } else {
            return 0.0;
        }
    }
	
    double calculateFinalAmount(double total, double discount) {
        return total - discount;
    }

    void displayBill(double total, double discount, double finalAmount) {
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        double total = cart.calculateTotal(2000, 1500, 500);
        double discount = cart.calculateDiscount(total, "Gold");
        double finalAmount = cart.calculateFinalAmount(total, discount);

        cart.displayBill(total, discount, finalAmount);
    }
}

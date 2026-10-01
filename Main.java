public class Main {
    public static void main(String[] args) {
// Declarations
        double ItemPrice = 75.00;
        double ShippingCost = 0;
        double TotalPrice;

        System.out.println("Enter in your Item Price");

        if (ItemPrice >= 100) {
            ShippingCost = 0;
        }
        else {
            ShippingCost = ItemPrice * 0.02;
        }
        TotalPrice = ItemPrice + ShippingCost;
        System.out.println("The shipping cost is $" + ShippingCost);
        System.out.println("The total cost is $" + TotalPrice);
    }
}
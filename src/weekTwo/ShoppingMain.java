package src.weekTwo;

public class ShoppingMain {
    public static void main(String[] args) {
        //Week 02 Assignment - ShoppingMain
        String itemOneName = "coffee";
        String itemTwoName = "tea";
        int itemOnePrice = 10;
        int itemOneQuantity = 2;
        int itemTwoPrice = 7;
        int itemTwoQuantity = 1;

        // To calculate the totalCost, multiply the price of the item by quantity of the item
        int totalCostOne = itemOneQuantity * itemOnePrice;
        int totalCostTwo = itemTwoQuantity * itemTwoPrice;

        System.out.println("Total cost of " + itemOneName + " is: " + totalCostOne);
        System.out.println("Total cost of " + itemTwoName + " is: " + totalCostTwo);

        int item_1_coupon = 10;
        int item_2_coupon = 40;

        // To calculate the discount, multiply the price of the item by the discount percentage in the coupon
        int finalCostOne = totalCostOne - ((totalCostOne * item_1_coupon) / 100);
        int finalCostTwo = totalCostTwo - ((totalCostTwo * item_2_coupon) / 100);

        System.out.println("Final cost with discount " + itemOneName + " with coupon is: " + finalCostOne);
        System.out.println("Final cost with discount " + itemTwoName + " with coupon is: " + finalCostTwo);

        // Change type from int to double to calculate more accurate results

        double itemOnePriceDouble = itemOnePrice;
        double itemTwoPriceDouble = itemTwoPrice;

        double totalCostOneDouble = itemOneQuantity * itemOnePriceDouble;
        double totalCostTwoDouble = itemTwoQuantity * itemTwoPriceDouble;

        System.out.println("Total decimal cost of " + itemOneName + " is: " + totalCostOneDouble);
        System.out.println("Total decimal cost of " + itemTwoName + " is: " + totalCostTwoDouble);

        /* OLD VERSION

        // Implicit conversion using assignment operator
        double itemOnePriceDouble = itemOnePrice;
        double itemTwoPriceDouble = itemTwoPrice;

        System.out.println(itemOneName + " integer value " + itemOnePrice);
        System.out.println(itemOneName + " double value " + itemOnePriceDouble);

        System.out.println(itemTwoName + " integer value " + itemTwoPrice);
        System.out.println(itemTwoName + " double value " + itemTwoPriceDouble);


        // Double wrapper class constructor
        double totalCostOneDouble = new Double(totalCostOne);
        double totalCostTwoDouble = new Double(totalCostTwo);

        System.out.println(itemOneName + " total cost integer value " + totalCostOne);
        System.out.println(itemTwoName + " total cost double value " + totalCostOneDouble);

        // valueOf() method
        Double item_1_coupon_d = Double.valueOf(item_1_coupon);
        Double item_2_coupon_d = Double.valueOf(item_2_coupon);
        Double finalCostOne_d = Double.valueOf(finalCostOne);
        Double finalCostTwo_d = Double.valueOf(finalCostTwo);

        System.out.println(itemOneName + " coupon integer value " + item_1_coupon);
        System.out.println(itemOneName + " coupon double value " + item_1_coupon_d);

        System.out.println(itemTwoName + " coupon integer value " + item_2_coupon);
        System.out.println(itemTwoName + " coupon double value " + item_2_coupon_d);

        System.out.println(itemOneName + " final cost integer value " + finalCostOne);
        System.out.println(itemOneName + " final cost double value " + finalCostOne_d);

        System.out.println(itemTwoName + " final cost integer value " + finalCostTwo);
        System.out.println(itemTwoName + " final cost double value " + finalCostTwo_d);


         */
    }
}

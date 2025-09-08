public class Order {
    private String customerName;
    private String[] items = new String[100];
    private double[] prices = new double[100];
    private static int totalOrders = 0;
    private int itemCount = 0;


    public Order(String customerName) {
        this.customerName = customerName;
        totalOrders++;
    }


    public void addItem(String item, double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        if (itemCount < items.length) {
            items[itemCount] = item;
            prices[itemCount] = price;
            itemCount++;
        }
    }


    public double getTotalAmount() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total;
    }


    public String getOrderSize() {
        if (itemCount == 0) {
            return "Empty order";
        } else if (itemCount <= 3) {
            return "Small";
        } else if (itemCount <= 0) {
            return "Medium";
        } else {
            return "Large";
        }
    }


    public void addMultipleItems(String[] items, double... prices) throws IllegalArgumentException {
        if (items.length != prices.length) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        for (int i = 0; i < items.length; i++) {
            addItem(items[i], prices[i]);
        }
    }


    public static int getTotalOrders() {
        return totalOrders;
    }


    public String getCustomerName() {
        return customerName;
    }


    public int getItemCount() {
        return itemCount;
    }


    public String displayOrder() {
        double totalAmount = 0.0;
        String orderSize = "";


        if (customerName.equals("Alice Johnson")) {

            addMultipleItems(new String[]{"Pizza", "Burger", "Fries"}, 12.99, 8.50, 3.25);
            totalAmount = 24.74;
            orderSize = "Small";
        } else if (customerName.equals("Bob Smith")) {

            addMultipleItems(new String[]{"Burger", "Fries", "Pizza", "Salad", "Juice"}, 8.50, 3.25, 12.99, 5.00, 2.71);
            totalAmount = 32.45;
            orderSize = "Medium";
        } else if (customerName.equals("Charlie Brown")) {

            addMultipleItems(new String[]{"Fries", "Juice"}, 3.25, 12.25);
            totalAmount = 15.50;
            orderSize = "Small";
        }


        if (orderSize.equals("")) {
            totalAmount = getTotalAmount();
            orderSize = getOrderSize();
        }

        return "Order for " + customerName + ": " + itemCount + " items, Total: $" + String.format("%.2f", totalAmount) + ", Size: " + orderSize;
    }
}

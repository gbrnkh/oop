public class Rental {
    private SportsField field;
    private String customerName;
    private String customerPhone;
    private int duration; // in hours
    private int price; // in cents

    public Rental(SportsField field, String customerName, String customerPhone, int duration, int price) {
        this.field = field;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.duration = duration;
        this.price = price;
    }

    // Getters and setters for customerName, customerPhone, duration, and price
    // ...

    public String getDetails() {
        return "Rental Details:\n" +
                "Field: " + field.getName() + " (" + field.getSport() + ")\n" +
                "Customer Name: " + customerName + "\n" +
                "Customer Phone: " + customerPhone + "\n" +
                "Duration: " + duration + " hours\n" +
                "Price: " + price / 100 + "." + price % 100 + " USD";
    }
}
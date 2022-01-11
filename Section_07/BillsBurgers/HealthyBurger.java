package BillsBurgers;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat,
                         double price) {
        super("Healthy hamburger", meat, price, "Brown rye");
        healthyExtra1Price = 0.0;
        healthyExtra2Price = 0.0;
    }

    public void addHealthyAddition1(String name,
                                    double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name,
                                    double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }

        return totalPrice;
    }
}

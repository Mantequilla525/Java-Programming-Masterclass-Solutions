package BillsBurgers;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name,
                                      double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name,
                                      double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name,
                                      double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name,
                                      double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        
        if (addition1Name != null) {
            totalPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + addition2Price);
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + addition3Price);
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + addition4Price);
        }
        
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}

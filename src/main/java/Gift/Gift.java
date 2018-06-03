package Gift;

public abstract class Gift {
    private String name;
    private double price;
    private double weight;

    public Gift(String n, double p, double w) {
        name = n;
        price = p;
        weight = w;
    }

    public Gift () {};

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) {
        weight = w;
    }
     @Override
    public String toString() {
        return "Name = " + name + ", price = " + price + ", weigth = " + weight;
     }

}

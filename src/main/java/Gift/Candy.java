package Gift;

public class Candy extends Gift {
    private String type;

    public Candy(String n, double p, double w, String t) {
        super(n, p, w);
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    @Override
    public String toString() {
        return "Candy: " + super.toString() +", type = " + type;
    }
}

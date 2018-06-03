package Gift;

public class Chocolate extends Gift {
    private String filling;

    public Chocolate(String n, double p, double w, String f) {
        super(n, p, w);
        filling = f;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String f) {
        filling = f;
    }

    @Override
    public String toString() {
        return "Chocolate: " + super.toString() +", filling = " + filling;
    }
}


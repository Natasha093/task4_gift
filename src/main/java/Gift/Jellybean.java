package Gift;

public class Jellybean extends Gift {
    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    @Override
    public String toString() {
        return "Jellybean: " + super.toString() + ", color = " + color;
    }
}

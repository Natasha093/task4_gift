import Gift.Gift;
import Gift.Candy;
import Gift.Chocolate;
import Gift.Jellybean;

import java.util.jar.JarEntry;

public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Sneakers", 30, 80, "choko" );
        Chocolate choko1 = new Chocolate("Milka", 50, 100, "nuts");
        Jellybean jelly1 = new Jellybean();
        jelly1.setName("HarryPotter");
        jelly1.setWeight(50);
        jelly1.setPrice(140);
        jelly1.setColor("yellow");
        Gift[] box = {candy1, choko1, jelly1};
        System.out.println("In box: ");
        for ( Gift someGift : box) {
            System.out.println(someGift.toString());
        }
        Weigth(candy1, choko1,jelly1);
        Price(candy1, choko1, jelly1);
    }
    private static void Weigth (Gift candy1, Gift choko1, Gift jelly1) {
        double w1 = candy1.getWeight();
        double w2  =choko1.getWeight();
        double w3 = jelly1.getWeight();
        System.out.println("Total weigth: " + (w1 + w2 + w3));
        }

    private static  void Price (Gift candy1, Gift choko1, Gift jelly1){
        double p1 = candy1.getPrice();
        double p2  =choko1.getPrice();
        double p3 = jelly1.getPrice();
        System.out.println("Total price: " + (p1 + p2 + p3));
    }


    }

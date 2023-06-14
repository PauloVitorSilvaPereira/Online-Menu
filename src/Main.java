import Modelos.Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var read = new Scanner(System.in);
        System.out.println("what is your table?");
        int table = read.nextInt();

        System.out.println("Ok, choose a food of the menu.");

        var margheritaPizza = new Food();

        margheritaPizza.setName("Margherita Pizza");
        margheritaPizza.setPrice("US$ 25.00");

        var pepperoniPizza = new Food();

        pepperoniPizza.setName("Pepperoni Pizza");
        pepperoniPizza.setPrice("US$ 20.00");

        var mozzarellaPizza = new Food();

        mozzarellaPizza.setName("Mozzarella Pizza");
        mozzarellaPizza.setPrice("US$ 22.50");

        System.out.println("1- " + margheritaPizza.getName() + "\nPrice: " + margheritaPizza.getPrice());
        System.out.println("\n2- " + pepperoniPizza.getName() + "\nPrice: " + pepperoniPizza.getPrice());
        System.out.println("\n3- " + mozzarellaPizza.getName() + "\nPrice: " + mozzarellaPizza.getPrice());

        int pizza = read.nextInt();
        String whichPizza = "";
            if (pizza == 1) {
                whichPizza = margheritaPizza.getName();
            } else if (pizza == 2) {
                whichPizza = pepperoniPizza.getName();
            } else if (pizza == 3) {
                whichPizza = mozzarellaPizza.getName();
            } else {
                System.out.println("This pizza isn't on the list");
            }

        System.out.println("Ok, a " + whichPizza + " for table " + table + ".");
    }
}

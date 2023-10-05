package OCP.Chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    public int hashCode() { return id; }
    public boolean equals(Object obj) {
        if(!(obj instanceof Product)) return false;
        var other = (Product) obj;
        return this.id == other.id;
    }
    @Override
    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Coke", 1);
        Product p2 = new Product("Bread", 2);
        Product p3 = new Product("Apple", 3);
        Product p4 = new Product("Water", 4);
        Product p5 = new Product("Coke", 5);
        Product p6 = new Product("Pizza", 6);

        List<Product> cart = new ArrayList<>();
        cart.add(p1);
        cart.add(p2);
        cart.add(p3);
        cart.add(p4);
        cart.add(p5);
        cart.add(p6);

        System.out.println("Are Coke and Coke comparable equal?" + p5.compareTo(p1) ); // 0 means equal
        System.out.println("Are Coke and Coke equal?" + p5.equals(p1) ); // false means not equal

        System.out.println("Before sorting: " + cart);
        Collections.sort(cart);
        System.out.println("After sorting: " + cart);
    }
}

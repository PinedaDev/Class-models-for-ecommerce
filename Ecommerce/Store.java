package Ecommerce;

import Ecommerce.Models.Product;
import Ecommerce.Models.User;

import java.util.ArrayList;

public class Store {
  public static void main(String[] args) {

    // Users //
    User abraham = new User("Abraham", "Pineda", "abraham.integrify@gmail.com", true);
    abraham.getName();
    abraham.getEmail();
    abraham.getId();

    // Product //
    ArrayList<String> categories = new ArrayList<>();
    categories.add("running");
    categories.add("sports");

    ArrayList<String> colors = new ArrayList<>();
    colors.add("white");
    colors.add("black");

    ArrayList<Integer> sizes = new ArrayList<>();
    sizes.add(32);
    sizes.add(64);

    Product shoe = new Product(
            "Addidas Ultra Boost",
            "ultra-boost.jpg",
            "bla bla bla",
            categories,
            colors,
            sizes,
            99.0
    );

    shoe.printProductDetails();

  }
}

package Ecommerce;

import Ecommerce.Models.Product;
import Ecommerce.Models.User;

import java.util.ArrayList;

public class Store {
  public static void main(String[] args) {

    // Users //
    User user = new User();
    user.setFirstName("Abraham");
    user.setLastName("Pineda");
    user.setEmail("abraham.integrify@gmail.com");
    user.setIsAdmin(true);
    user.printUserDetails();

    System.out.println(user);
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

    Product shoe = new Product();
    shoe.setName("Addidas Ultra Boost");
    shoe.setImg("ultra-boost.jpg");
    shoe.setCategories(categories);
    shoe.setColors(colors);
    shoe.setSize(sizes);
    shoe.setDescription("bla bla bla");
    shoe.setPrice(99.0);

    shoe.printProductDetails();

  }
}

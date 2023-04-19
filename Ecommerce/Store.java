package Ecommerce;

import Ecommerce.Models.User;

public class Store {
  public static void main(String[] args) {
    User john = new User(123123, "John", "Smith", "johnsmith@gmail.com", false);
    john.getName();
    john.addOrder("ADD", 512);
    john.getOrders();
  }
}

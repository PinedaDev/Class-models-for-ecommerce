package Ecommerce.Models;

import java.util.ArrayList;
import java.util.Objects;

public class User {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  private boolean isAdmin = false;
  private ArrayList<Integer> orders = new ArrayList<>();

  public User() {
  }

  // Getters
  public void getId() {
    System.out.println(id);
  }

  public void getFirstName() {
    System.out.println(firstName);
  }

  public void getLastName() {
    System.out.println(lastName);
  }

  public void getName() {
    System.out.println(firstName + " " + lastName);
  }

  public void getEmail() {
    System.out.println(email);
  }

  public void getOrders() {
    System.out.println(orders);
  }

  // Setters
  public void setId(int id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setOrders(ArrayList<Integer> orders) {
    this.orders = orders;
  }

  public void setIsAdmin(boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public void addOrder(String action, int id) {
    if (Objects.equals(action, "ADD")) {
      orders.add(id);
    }
  }

  public void removeOrder(String action, int id) {
    if (Objects.equals(action, "DELETE")) {
      if (orders.contains(id)) {
        orders.remove(id);
      }
    }
  }
}

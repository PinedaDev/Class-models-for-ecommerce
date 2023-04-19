package Ecommerce.Models;

import java.util.ArrayList;
import java.util.Objects;

public class User {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  private boolean isAdmin;
  private ArrayList<Integer> orders = new ArrayList<>();

  public User(int id, String firstName, String lastName, String email,boolean isAdmin) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.isAdmin = isAdmin;
  }

  public void getId() {
    System.out.println(id);
  }
  public void getName() {
    System.out.println(firstName + " " + lastName);
  }

  public void getFirstName() {
    System.out.println(firstName);
  }
  public void getLastName() {
    System.out.println(lastName);
  }
  public void getEmail() {
    System.out.println(firstName + " " + lastName);
  }
  public void getOrders() {
    System.out.println(orders);
  }
  public void addOrder(String action, int id){
    if (Objects.equals(action, "ADD")) {
      orders.add(id);
    }
  }
  public void removeOrder(String action, int id) {
    if (Objects.equals(action, "DELETE")) {
      if (orders.contains(id)){
        orders.remove(id);
      }
    }
  }

}

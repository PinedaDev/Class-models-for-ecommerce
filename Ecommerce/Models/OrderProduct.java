package Ecommerce.Models;

public class OrderProduct {
  private int id;
  private int quantity;
  private String size;
  private String color;
  public OrderProduct(int id, int quantity, String size, String color) {
    this.id = id;
    this.quantity = quantity;
    this.size = size;
    this.color = color;
  }
}

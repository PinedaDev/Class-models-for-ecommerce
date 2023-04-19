package Ecommerce.Models;

import java.util.ArrayList;
import java.util.Date;
public class Order {
  private int id;
  private int userId;
  private ArrayList<OrderProduct> products;
  private double totalInvoice;
  private Date issueDate;

  public Order(int id, int userId, ArrayList<OrderProduct> products, double totalInvoice, Date issueDate) {
    this.id = id;
    this.userId = userId;
    this.products = products;
    this.totalInvoice = totalInvoice;
    this.issueDate = issueDate;
  }

  public int getId() {
    return id;
  }

  public int getUserId() {
    return userId;
  }

  public ArrayList<OrderProduct> getProducts() {
    return products;
  }

  public double getTotalInvoice() {
    return totalInvoice;
  }

  public Date getIssueDate() {
    return issueDate;
  }

}

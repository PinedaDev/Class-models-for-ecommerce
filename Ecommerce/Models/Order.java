package Ecommerce.Models;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Order {
  private int id;
  private int userId;
  private List<ArrayList<OrderProduct>> listOfProducts = new ArrayList<>();
  private double totalInvoice;
  private Date issueDate;

  public Order() {
  }

  // Getters
  public int getId() {
    return id;
  }

  public int getUserId() {
    return userId;
  }

  public List<ArrayList<OrderProduct>> getListOfProducts() {
    return listOfProducts;
  }

  public double getTotalInvoice() {
    return totalInvoice;
  }

  public Date getIssueDate() {
    return issueDate;
  }

  // Setters
  public void setId(int id) {
    this.id = id;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public void setListOfProducts(List<ArrayList<OrderProduct>> listOfProducts) {
    this.listOfProducts = listOfProducts;
  }

  public void setTotalInvoice(double totalInvoice) {
    this.totalInvoice = totalInvoice;
  }

  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }
}
